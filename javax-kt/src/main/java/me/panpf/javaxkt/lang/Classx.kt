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

@file:Suppress("NOTHING_TO_INLINE")

package me.panpf.javaxkt.lang

import me.panpf.javax.lang.Classx
import java.lang.reflect.Constructor
import java.lang.reflect.Field
import java.lang.reflect.Method


/*
 * Class related extension methods or properties
 */


/**
 * Get the field with the specified name from the specified class
 */
@Throws(NoSuchFieldException::class)
inline fun Class<*>.getFieldWithParent(fieldName: String): Field = Classx.getFieldWithParent(this, fieldName)

/**
 * Get the field with the specified name from the object
 */
@Throws(NoSuchFieldException::class)
inline fun Any.getFieldWithParent(fieldName: String): Field = Classx.getFieldWithParent(this, fieldName)

/**
 * Get all the fields of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's field, -1: Get all the parent class fields
 */
inline fun Class<*>.getFieldsWithParent(upwards: Int = -1): Array<Field> = Classx.getFieldsWithParent(this, upwards)

/**
 * Get all the fields of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's field, -1: Get all the parent class fields
 */
inline fun Any.getFieldsWithParent(upwards: Int = -1): Array<Field> = Classx.getFieldsWithParent(this, upwards)

/**
 * Get the value of the specified field
 */
inline fun Any.getFieldValue(field: Field): Any? = Classx.getFieldValue(this, field)

/**
 * Get the value of the specified field name
 */
@Throws(NoSuchFieldException::class)
inline fun Any.getFieldValue(fieldName: String): Any? = Classx.getFieldValue(this, fieldName)

/**
 * Set field value
 */
inline fun Any.setFieldValue(field: Field, newValue: Any?) = Classx.setFieldValue(this, field, newValue)

/**
 * Set field value by field name
 */
@Throws(NoSuchFieldException::class)
inline fun Any.setFieldValue(fieldName: String, newValue: Any?) = Classx.setFieldValue(this, fieldName, newValue)


/**
 * Get the method with the specified name from the specified class
 */
@Throws(NoSuchMethodException::class)
inline fun Class<*>.getMethodWithParent(methodName: String, vararg params: Class<*>): Method = Classx.getMethodWithParent(this, methodName, *params)


/**
 * Get the method with the specified name from the object
 */
@Throws(NoSuchMethodException::class)
inline fun Any.getMethodWithParent(methodName: String, vararg params: Class<*>): Method = Classx.getMethodWithParent(this, methodName, *params)

/**
 * Get all the methods of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's method, -1: Get all the parent class methods
 */
inline fun Class<*>.getMethodsWithParent(upwards: Int = -1): Array<Method> = Classx.getMethodsWithParent(this, upwards)

/**
 * Get all the methods of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's method, -1: Get all the parent class methods
 */
inline fun Any.getMethodsWithParent(upwards: Int = -1): Array<Method> = Classx.getMethodsWithParent(this, upwards)

/**
 * Method of executing of the specified object
 */
inline fun Any.callMethod(method: Method, vararg params: Any): Any? = Classx.callMethod(this, method, *params)

/**
 * Method of executing the specified name of the specified object
 */
@Throws(NoSuchMethodException::class)
inline fun Any.callMethod(methodName: String, vararg params: Any): Any? = Classx.callMethod(this, methodName, *params)


/**
 * Get the constructor from the specified class
 */
@Throws(NoSuchMethodException::class)
inline fun Class<*>.getConstructorWithParent(vararg params: Class<*>): Constructor<*> = Classx.getConstructorWithParent(this, *params)


/**
 * Get the constructor from the object
 */
@Throws(NoSuchMethodException::class)
inline fun Any.getConstructorWithParent(vararg params: Class<*>): Constructor<*> = Classx.getConstructorWithParent(this, *params)

/**
 * Get all the constructors of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's constructor, -1: Get all the parent class constructors
 */
inline fun Class<*>.getConstructorsWithParent(upwards: Int = -1): Array<Constructor<*>> = Classx.getConstructorsWithParent(this, upwards)

/**
 * Get all the constructors of a given class and its parent classes
 *
 * @param upwards Go up to how many layers to get the parent class's constructor, -1: Get all the parent class constructors
 */
inline fun Any.getConstructorsWithParent(upwards: Int = -1): Array<Constructor<*>> = Classx.getConstructorsWithParent(this, upwards)


/**
 * Get all the inheritance lists of the specified class
 *
 * @param ignoreSelf Ignore myself in the return list
 */
inline fun Class<*>.getClassHierarchy(ignoreSelf: Boolean = false): Array<Class<*>> = Classx.getClassHierarchy(this, ignoreSelf)

/**
 * Get all the inheritance lists of the object
 *
 * @param ignoreSelf Ignore myself in the return list
 */
inline fun Any.getClassHierarchy(ignoreSelf: Boolean = false): Array<Class<*>> = Classx.getClassHierarchy(this, ignoreSelf)


/**
 * Determine if the given field is an array of the specified type
 */
inline fun Field.isTypeArray(type: Class<*>): Boolean = Classx.isTypeArray(this, type)

/**
 * Determine if a given field is a collection of the specified type
 */
inline fun Field.isTypeCollection(collectionType: Class<out Collection<*>>, type: Class<*>): Boolean = Classx.isTypeCollection(this, collectionType, type)