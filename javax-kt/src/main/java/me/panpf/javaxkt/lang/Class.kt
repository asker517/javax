/*
 * Copyright (C) 2018 Peng fei Pan <panpfpanpf@outlook.com>
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

package me.panpf.javaxkt.lang

import java.lang.reflect.*
import java.util.*

/*
 * Class tool
 */

/**
 * Get the field with the specified name from the specified class
 */
@Throws(NoSuchFieldException::class)
fun Class<*>.getFieldWithParent(fieldName: String): Field {
    var field: Field? = null

    var currentClazz: Class<*>? = this
    while (field == null && currentClazz != null) {
        try {
            field = currentClazz.getDeclaredField(fieldName)
        } catch (e: NoSuchFieldException) {
        }

        if (field == null) {
            currentClazz = currentClazz.superclass
        }
    }

    return field ?: throw NoSuchFieldException("No such field by name '$fieldName' in class '${this.name}' and its parent class")
}

/**
 * Get the field with the specified name from the object
 */
@Throws(NoSuchFieldException::class)
fun Any.getFieldWithParent(fieldName: String): Field = this::class.java.getFieldWithParent(fieldName)

/**
 * Get all the fields of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's field, -1: Get all the parent class fields
 */
fun Class<*>.getFieldsWithParent(upwards: Int = -1): Array<Field> {
    val fieldList = LinkedList<Field>()

    var currentClazz: Class<*>? = this
    var upwardsNumber = 0
    while (currentClazz != null) {
        val fields = currentClazz.declaredFields
        if (fields != null) {
            Collections.addAll(fieldList, *fields)
        }
        currentClazz = if (upwards == -1 || upwardsNumber++ < upwards) {
            currentClazz.superclass
        } else {
            null
        }
    }

    return fieldList.toTypedArray()
}

/**
 * Get all the fields of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's field, -1: Get all the parent class fields
 */
fun Any.getFieldsWithParent(upwards: Int = -1): Array<Field> = this::class.java.getFieldsWithParent(upwards)

/**
 * Get the value of the specified field
 */
fun Any.getFieldValue(field: Field): Any? {
    field.isAccessible = true
    try {
        return field.get(this)
    } catch (e: IllegalAccessException) {
        throw IllegalStateException(e)
    }
}

/**
 * Get the value of the specified field name
 */
@Throws(NoSuchFieldException::class)
fun Any.getFieldValue(fieldName: String): Any? {
    return this.getFieldValue(this.getFieldWithParent(fieldName))
}

/**
 * Set field value
 */
fun Any.setFieldValue(field: Field, newValue: Any?) {
    field.isAccessible = true
    try {
        field.set(this, newValue)
    } catch (e: IllegalAccessException) {
        throw IllegalStateException(e)
    }
}

/**
 * Set field value by field name
 */
@Throws(NoSuchFieldException::class)
fun Any.setFieldValue(fieldName: String, newValue: Any?) {
    this.setFieldValue(this.getFieldWithParent(fieldName), newValue)
}


/**
 * Get the method with the specified name from the specified class
 */
@Throws(NoSuchMethodException::class)
fun Class<*>.getMethodWithParent(methodName: String, vararg params: Class<*>): Method {
    var method: Method? = null

    var currentClazz: Class<*>? = this
    while (method == null && currentClazz != null) {
        try {
            method = currentClazz.getDeclaredMethod(methodName, *params)
        } catch (e: NoSuchMethodException) {
        }

        if (method == null) {
            currentClazz = currentClazz.superclass
        }
    }

    return method ?: throw NoSuchMethodException("No such method by name '$methodName' and params '${Arrays.toString(params)}' in class '${this.name}' and its parent class")
}


/**
 * Get the method with the specified name from the object
 */
@Throws(NoSuchMethodException::class)
fun Any.getMethodWithParent(methodName: String, vararg params: Class<*>): Method = this::class.java.getMethodWithParent(methodName, *params)

/**
 * Get all the methods of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's method, -1: Get all the parent class methods
 */
fun Class<*>.getMethodsWithParent(upwards: Int = -1): Array<Method> {
    val methodList = LinkedList<Method>()

    var currentClazz: Class<*>? = this
    var upwardsNumber = 0
    while (currentClazz != null) {
        val methods = currentClazz.declaredMethods
        if (methods != null) {
            Collections.addAll(methodList, *methods)
        }
        currentClazz = if (upwards == -1 || upwardsNumber++ < upwards) currentClazz.superclass else null
    }

    return methodList.toTypedArray()
}

/**
 * Get all the methods of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's method, -1: Get all the parent class methods
 */
fun Any.getMethodsWithParent(upwards: Int = -1): Array<Method> = this::class.java.getMethodsWithParent(upwards)

/**
 * Method of executing of the specified object
 */
fun Any.callMethod(method: Method, vararg params: Any): Any? {
    method.isAccessible = true
    try {
        return method.invoke(this, *params)
    } catch (e: IllegalAccessException) {
        throw IllegalStateException(e)
    } catch (e: InvocationTargetException) {
        throw IllegalStateException(e)
    }
}

/**
 * Method of executing the specified name of the specified object
 */
@Throws(NoSuchMethodException::class)
fun Any.callMethod(methodName: String, vararg params: Any): Any? {
    val paramClazzArray = params.map { it.javaClass }.toTypedArray()
    val method = this.getMethodWithParent(methodName, *paramClazzArray)
    return this.callMethod(method, *params)
}


/**
 * Get the constructor from the specified class
 */
@Throws(NoSuchMethodException::class)
fun Class<*>.getConstructorWithParent(vararg params: Class<*>): Constructor<*> {
    var constructor: Constructor<*>? = null

    var currentClazz: Class<*>? = this
    while (constructor == null && currentClazz != null) {
        try {

            constructor = currentClazz.getDeclaredConstructor(*params)
        } catch (e: NoSuchMethodException) {
        }

        if (constructor == null) {
            currentClazz = currentClazz.superclass
        }
    }

    return constructor ?: throw NoSuchMethodException("No such constructor by params '${Arrays.toString(params)}' in class '${this.name}' and its parent class")
}


/**
 * Get the constructor from the object
 */
@Throws(NoSuchMethodException::class)
fun Any.getConstructorWithParent(vararg params: Class<*>): Constructor<*> = this::class.java.getConstructorWithParent(*params)

/**
 * Get all the constructors of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's constructor, -1: Get all the parent class constructors
 */
fun Class<*>.getConstructorsWithParent(upwards: Int = -1): Array<Constructor<*>> {
    val constructorList = LinkedList<Constructor<*>>()

    var currentClazz: Class<*>? = this
    var upwardsNumber = 0
    while (currentClazz != null) {
        currentClazz.declaredConstructors?.let { constructorList.addAll(it) }
        currentClazz = if (upwards == -1 || upwardsNumber++ < upwards) {
            currentClazz.superclass
        } else {
            null
        }
    }

    return constructorList.toTypedArray()
}

/**
 * Get all the constructors of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's constructor, -1: Get all the parent class constructors
 */
fun Any.getConstructorsWithParent(upwards: Int = -1): Array<Constructor<*>> = this::class.java.getConstructorsWithParent(upwards)


/**
 * Get all the inheritance lists of the specified class
 *
 * @param ignoreSelf Ignore myself in the return list
 */
fun Class<*>.getClassHierarchy(ignoreSelf: Boolean = false): Array<Class<*>> {
    val classList = LinkedList<Class<*>>()
    var currentClazz: Class<*>?
    currentClazz = if (!ignoreSelf) this else this.superclass
    while (currentClazz != null) {
        classList.add(currentClazz)
        currentClazz = currentClazz.superclass
    }

    return classList.toTypedArray()
}

/**
 * Get all the inheritance lists of the object
 *
 * @param ignoreSelf Ignore myself in the return list
 */
fun Any.getClassHierarchy(ignoreSelf: Boolean = false): Array<Class<*>> = this::class.java.getClassHierarchy(ignoreSelf)


/**
 * Determine if the given field is an array of the specified type
 */
fun Field.isTypeArray(type: Class<*>): Boolean {
    val fieldType = this.type
    return fieldType.isArray && type.isAssignableFrom(fieldType.componentType)
}

/**
 * Determine if a given field is a collection of the specified type
 */
fun Field.isTypeCollection(collectionType: Class<out Collection<*>>, type: Class<*>): Boolean {
    val fieldType = this.type
    return if (collectionType.isAssignableFrom(fieldType)) {
        val first = (this.genericType as ParameterizedType).actualTypeArguments[0] as Class<*>
        type.isAssignableFrom(first)
    } else {
        false
    }
}