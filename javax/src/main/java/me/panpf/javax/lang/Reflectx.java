/*
 * Copyright (C) 2018 Peng fei Pan <sky@panpf.me>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.panpf.javax.lang;

import me.panpf.javax.util.Arrayx;
import me.panpf.javax.util.Convert;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.*;
import java.util.*;

/**
 * Reflection tool
 */
@SuppressWarnings({"WeakerAccess"})
public class Reflectx {

    /**
     * Get the field with the specified name from the specified class
     */
    @NotNull
    public static Field getField(@NotNull Class<?> clazz, @NotNull String fieldName) throws NoSuchFieldException {
        Field field = null;

        Class currentClazz = clazz;
        while (field == null && currentClazz != null) {
            try {
                field = currentClazz.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

            if (field == null) {
                currentClazz = currentClazz.getSuperclass();
            }
        }

        if (field == null) {
            throw new NoSuchFieldException("Not found field by name '" + fieldName + "' in class '" + clazz.getName() + "'");
        } else {
            return field;
        }
    }

    /**
     * Get all the fields of a given class and its parent classes
     *
     * @param upwards Go up to how many layers to get the parent class's field, -1: Get all the parent class fields
     */
    @Nullable
    public static Field[] getFields(@NotNull Class<?> clazz, int upwards) {
        List<Field> fieldList = new LinkedList<>();

        Class currentClazz = clazz;
        int upwardsNumber = 0;
        while (currentClazz != null) {
            Field[] fields = currentClazz.getDeclaredFields();
            if (fields != null) {
                Collections.addAll(fieldList, fields);
            }
            if (upwards == -1 || upwardsNumber++ < upwards) {
                currentClazz = currentClazz.getSuperclass();
            } else {
                currentClazz = null;
            }
        }

        //noinspection ToArrayCallWithZeroLengthArrayArgument
        return fieldList.isEmpty() ? null : fieldList.toArray(new Field[fieldList.size()]);
    }

    /**
     * Get all the fields of a given class and all its parent classes
     */
    @Nullable
    public static Field[] getFields(@NotNull Class<?> clazz) {
        return getFields(clazz, -1);
    }

    /**
     * Get the value of the specified field
     */
    @Nullable
    public static Object getFieldValue(@NotNull Object object, @NotNull Field field) {
        field.setAccessible(true);
        try {
            return field.get(object);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Set field value
     */
    public static void setFieldValue(@NotNull Object object, @NotNull Field field, @Nullable Object newValue) {
        field.setAccessible(true);
        try {
            field.set(object, newValue);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    /**
     * Get the value of the specified field name
     */
    @Nullable
    public static Object getFieldValue(@NotNull Object object, @NotNull String fieldName) throws NoSuchFieldException {
        return getFieldValue(object, getField(object.getClass(), fieldName));
    }

    /**
     * Set field value by field name
     */
    public static void setFieldValue(@NotNull Object object, @NotNull String fieldName, @Nullable Object newValue) throws NoSuchFieldException {
        setFieldValue(object, getField(object.getClass(), fieldName), newValue);
    }


    /**
     * Get the method with the specified name from the specified class
     */
    @NotNull
    public static Method getMethod(@NotNull Class<?> clazz, @NotNull String methodName, @Nullable Class<?>... params) throws NoSuchMethodException {
        Method method = null;

        Class currentClazz = clazz;
        while (method == null && currentClazz != null) {
            try {
                //noinspection unchecked
                method = currentClazz.getDeclaredMethod(methodName, params);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            if (method == null) {
                currentClazz = currentClazz.getSuperclass();
            }
        }

        if (method == null) {
            throw new NoSuchMethodException("Not found method by name '" + methodName + "' and params '" + Arrays.toString(params) + "' in class '" + clazz.getName() + "'");
        } else {
            return method;
        }
    }

    /**
     * Get all the methods of a given class and its parent classes
     *
     * @param upwards Go up to how many layers to get the parent class's method, -1: Get all the parent class methods
     */
    @Nullable
    public static Method[] getMethods(@NotNull Class<?> clazz, int upwards) {
        List<Method> methodList = new LinkedList<>();

        Class currentClazz = clazz;
        int upwardsNumber = 0;
        while (currentClazz != null) {
            Method[] methods = currentClazz.getDeclaredMethods();
            if (methods != null) {
                Collections.addAll(methodList, methods);
            }
            if (upwards == -1 || upwardsNumber++ < upwards) {
                currentClazz = currentClazz.getSuperclass();
            } else {
                currentClazz = null;
            }
        }

        //noinspection ToArrayCallWithZeroLengthArrayArgument
        return methodList.isEmpty() ? null : methodList.toArray(new Method[methodList.size()]);
    }

    /**
     * Get all the methods of a given class and all its parent classes
     */
    @Nullable
    public static Method[] getMethods(@NotNull Class<?> clazz) {
        return getMethods(clazz, -1);
    }

    /**
     * Method of executing the specified name of the specified object
     */
    @Nullable
    public static Object callMethod(@NotNull Object object, @NotNull String methodName, @Nullable Object... params) throws NoSuchMethodException, InvocationTargetException {
        Class[] paramClazzs = params != null ? Arrayx.map(params, new Convert<Object, Class<?>>() {
            @Override
            public Class<?> convert(Object o) {
                return o.getClass();
            }
        }, new Class[params.length]) : null;
        Method method = getMethod(object.getClass(), methodName, paramClazzs);
        method.setAccessible(true);
        try {
            return method.invoke(object, params);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new IllegalStateException(e);
        }
    }

    /**
     * Method of executing of the specified object
     */
    @Nullable
    public static Object callMethod(@NotNull Object object, @NotNull Method method, @Nullable Object... params) throws InvocationTargetException {
        method.setAccessible(true);
        try {
            return method.invoke(object, params);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new IllegalStateException(e);
        }
    }


    /**
     * Get the constructor from the specified class
     */
    @NotNull
    public static Constructor<?> getConstructor(@NotNull Class<?> clazz, @Nullable Class<?>... params) throws NoSuchMethodException {
        Constructor constructor = null;

        Class currentClazz = clazz;
        while (constructor == null && currentClazz != null) {
            try {
                //noinspection unchecked
                constructor = currentClazz.getDeclaredConstructor(params);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            if (constructor == null) {
                currentClazz = currentClazz.getSuperclass();
            }
        }

        if (constructor == null) {
            throw new NoSuchMethodException("Not found constructor by params '" + Arrays.toString(params) + "' in class '" + clazz.getName() + "'");
        } else {
            return constructor;
        }
    }

    /**
     * Get all the constructors of a given class and its parent classes
     *
     * @param upwards Go up to how many layers to get the parent class's constructor, -1: Get all the parent class constructors
     */
    @NotNull
    public static Constructor[] getConstructors(@NotNull Class<?> clazz, int upwards) {
        List<Constructor> constructorList = new LinkedList<>();

        Class currentClazz = clazz;
        int upwardsNumber = 0;
        while (currentClazz != null) {
            Constructor[] constructors = currentClazz.getDeclaredConstructors();
            if (constructors != null) {
                Collections.addAll(constructorList, constructors);
            }
            if (upwards == -1 || upwardsNumber++ < upwards) {
                currentClazz = currentClazz.getSuperclass();
            } else {
                currentClazz = null;
            }
        }

        //noinspection ToArrayCallWithZeroLengthArrayArgument
        return constructorList.toArray(new Constructor[constructorList.size()]);
    }

    /**
     * Get all the constructors of a given class and its parent classes
     */
    @NotNull
    public static Constructor[] getConstructors(@NotNull Class<?> clazz) {
        return getConstructors(clazz, -1);
    }


    /**
     * Get all the inheritance lists of the specified class
     *
     * @param ignoreSelf Ignore myself in the return list
     */
    @NotNull
    public static Class<?>[] getHierarchyClasss(@NotNull Class<?> clazz, boolean ignoreSelf) {
        List<Class<?>> classList = new LinkedList<>();
        Class<?> currentClazz;
        if (!ignoreSelf) {
            currentClazz = clazz;
        } else {
            currentClazz = clazz.getSuperclass();
        }
        while (currentClazz != null) {
            classList.add(currentClazz);
            currentClazz = currentClazz.getSuperclass();
        }
        //noinspection ToArrayCallWithZeroLengthArrayArgument
        return classList.toArray(new Class<?>[classList.size()]);
    }

    /**
     * Get all the inheritance lists of the specified class
     */
    @NotNull
    public static Class<?>[] getHierarchyClasss(@NotNull Class<?> clazz) {
        return getHierarchyClasss(clazz, false);
    }


    /**
     * Determine if the given field is an array of the specified type
     */
    public static boolean isTypeArray(@NotNull Field field, @NotNull Class<?> type) {
        Class<?> fieldType = field.getType();
        return fieldType.isArray() && type.isAssignableFrom(fieldType.getComponentType());
    }

    /**
     * Determine if a given field is a collection of the specified type
     */
    public static boolean isTypeCollection(@NotNull Field field, @NotNull Class<? extends Collection> collectionType, @NotNull Class<?> type) {
        Class<?> fieldType = field.getType();
        if (collectionType.isAssignableFrom(fieldType)) {
            Class<?> first = (Class<?>) ((ParameterizedType) field.getGenericType()).getActualTypeArguments()[0];
            return type.isAssignableFrom(first);
        } else {
            return false;
        }
    }
}
