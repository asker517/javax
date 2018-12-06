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

package me.panpf.javax.sequences;

import me.panpf.javax.util.*;
import me.panpf.javax.util.Action;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.*;

/**
 * Sequence tool method
 */
public class Sequencex {
    // TODO: 2018/11/28 测试

    private Sequencex() {
    }


    /* ******************************************* joinToArrayString ******************************************* */


    /**
     * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
     */
    @NotNull
    public static <T> String joinToArrayString(@Nullable Sequence<T> sequence, @Nullable Transformer<T, CharSequence> transform) {
        return joinToString(sequence, ", ", "[", "]", -1, "...", transform);
    }

    /**
     * Creates a string from all the elements separated using ', ' and using the given '[' and ']' if supplied.
     */
    @NotNull
    public static <T> String joinToArrayString(@Nullable Sequence<T> sequence) {
        return joinToString(sequence, ", ", "[", "]", -1, "...", null);
    }


    /*
     * *****************************************************************************************************************
     * From kotlin standard library
     * *****************************************************************************************************************
     */


    /**
     * Returns a wrapper sequence that provides values of this sequence, but ensures it can be iterated only one time.
     * <p>
     * The operation is _intermediate_ and _stateless_.
     * <p>
     * [IllegalStateException] is thrown on iterating the returned sequence from the second time.
     */
    public static <T> Sequence<T> constrainOnce(@NotNull Sequence<T> sequence) {
        return sequence instanceof ConstrainedOnceSequence ? sequence : new ConstrainedOnceSequence<T>(sequence);
    }

    /**
     * Performs the given [action] on each element.
     * <p>
     * The operation is _terminal_.
     */
    public static <T> void forEach(@Nullable Sequence<T> sequence, @NotNull Action<T> action) {
        if (sequence != null) {
            Iterator<T> iterator = sequence.iterator();
            while (iterator.hasNext()) {
                T element = iterator.next();
                action.action(element);
            }
        }
    }

    // TODO: 2018/11/26 转换成 java

    //    /**
//     * Returns a sequence containing all elements that are instances of specified class.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public fun <R> Sequence<*>.filterIsInstance(klass: Class<R>): Sequence<R> {
//        @Suppress("UNCHECKED_CAST")
//        return filter { klass.isInstance(it) } as Sequence<R>
//    }
//
///**
// * Appends all elements that are instances of specified class to the given [destination].
// *
// * The operation is _terminal_.
// */
//    public fun <C : MutableCollection<in R>, R> Sequence<*>.filterIsInstanceTo(destination: C, klass: Class<R>): C {
//        @Suppress("UNCHECKED_CAST")
//        for (element in this) if (klass.isInstance(element)) destination.add(element as R)
//        return destination
//    }
//
///**
// * Returns a [SortedSet][java.util.SortedSet] of all elements.
// *
// * The operation is _terminal_.
// */
//    public fun <T : Comparable<T>> Sequence<T>.toSortedSet(): java.util.SortedSet<T> {
//        return toCollection(java.util.TreeSet<T>())
//    }
//
//    /**
//     * Returns a [SortedSet][java.util.SortedSet] of all elements.
//     *
//     * Elements in the set returned are sorted according to the given [comparator].
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.toSortedSet(comparator: Comparator<in T>): java.util.SortedSet<T> {
//        return toCollection(java.util.TreeSet<T>(comparator))
//    }
//
//    /**
//     * Creates a sequence that returns all values from this enumeration. The sequence is constrained to be iterated only once.
//     * @sample samples.collections.Sequences.Building.sequenceFromEnumeration
//     */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> java.util.Enumeration<T>.asSequence(): Sequence<T> = this.iterator().asSequence()
//
//
//    /**
//     * Given an [iterator] function constructs a [Sequence] that returns values through the [Iterator]
//     * provided by that function.
//     * The values are evaluated lazily, and the sequence is potentially infinite.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromIterator
//     */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Sequence(crossinline iterator: () -> Iterator<T>): Sequence<T> = object : Sequence<T> {
//        override fun iterator(): Iterator<T> = iterator()
//    }
//
//    /**
//     * Creates a sequence that returns all elements from this iterator. The sequence is constrained to be iterated only once.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceFromIterator
//     */
//    public fun <T> Iterator<T>.asSequence(): Sequence<T> = Sequence { this }.constrainOnce()
//
//    /**
//     * Creates a sequence that returns the specified values.
//     *
//     * @sample samples.collections.Sequences.Building.sequenceOfValues
//     */
//    public fun <T> sequenceOf(vararg elements: T): Sequence<T> = if (elements.isEmpty()) emptySequence() else elements.asSequence()
//

    /**
     * Returns an empty sequence.
     */
    @NotNull
    public static <T> Sequence<T> emptySequence() {
        return (Sequence<T>) EmptySequence.INSTANCE;
    }

//
//    /**
//     * Returns a sequence of all elements from all sequences in this sequence.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public fun <T> Sequence<Sequence<T>>.flatten(): Sequence<T> = flatten { it.iterator() }
//
///**
// * Returns a sequence of all elements from all iterables in this sequence.
// *
// * The operation is _intermediate_ and _stateless_.
// */
//    @kotlin.jvm.JvmName("flattenSequenceOfIterable")
//    public fun <T> Sequence<Iterable<T>>.flatten(): Sequence<T> = flatten { it.iterator() }
//
//    private fun <T, R> Sequence<T>.flatten(iterator: (T) -> Iterator<R>): Sequence<R> {
//        if (this is TransformingSequence<*, *>) {
//            return (this as TransformingSequence<*, T>).flatten(iterator)
//        }
//        return FlatteningSequence(this, { it }, iterator)
//    }
//
//    /**
//     * Returns a pair of lists, where
//     * *first* list is built from the first values of each pair from this sequence,
//     * *second* list is built from the second values of each pair from this sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T, R> Sequence<Pair<T, R>>.unzip(): Pair<List<T>, List<R>> {
//        val listT = ArrayList<T>()
//        val listR = ArrayList<R>()
//        for (pair in this) {
//            listT.add(pair.first)
//            listR.add(pair.second)
//        }
//        return listT to listR
//    }
//
//
//
//
//    /**
//     * Returns a wrapper sequence that provides values of this sequence, but ensures it can be iterated only one time.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     *
//     * [IllegalStateException] is thrown on iterating the returned sequence from the second time.
//     *
//     */
//    public fun <T> Sequence<T>.constrainOnce(): Sequence<T> {
//        // as? does not work in js
//        //return this as? ConstrainedOnceSequence<T> ?: ConstrainedOnceSequence(this)
//        return if (this is ConstrainedOnceSequence<T>) this else ConstrainedOnceSequence(this)
//    }
//
//
///**
// * Returns a sequence which invokes the function to calculate the next value on each iteration until the function returns `null`.
// *
// * The returned sequence is constrained to be iterated only once.
// *
// * @see constrainOnce
// * @see kotlin.coroutines.experimental.buildSequence
// *
// * @sample samples.collections.Sequences.Building.generateSequence
// */
//    public fun <T : Any> generateSequence(nextFunction: () -> T?): Sequence<T> {
//        return GeneratorSequence(nextFunction, { nextFunction() }).constrainOnce()
//    }
//
///**
// * Returns a sequence defined by the starting value [seed] and the function [nextFunction],
// * which is invoked to calculate the next value based on the previous one on each iteration.
// *
// * The sequence produces values until it encounters first `null` value.
// * If [seed] is `null`, an empty sequence is produced.
// *
// * The sequence can be iterated multiple times, each time starting with [seed].
// *
// * @see kotlin.coroutines.experimental.buildSequence
// *
// * @sample samples.collections.Sequences.Building.generateSequenceWithSeed
// */
//    @kotlin.internal.LowPriorityInOverloadResolution
//    public fun <T : Any> generateSequence(seed: T?, nextFunction: (T) -> T?): Sequence<T> =
//            if (seed == null)
//    EmptySequence
//    else
//    GeneratorSequence({ seed }, nextFunction)
//
///**
// * Returns a sequence defined by the function [seedFunction], which is invoked to produce the starting value,
// * and the [nextFunction], which is invoked to calculate the next value based on the previous one on each iteration.
// *
// * The sequence produces values until it encounters first `null` value.
// * If [seedFunction] returns `null`, an empty sequence is produced.
// *
// * The sequence can be iterated multiple times.
// *
// * @see kotlin.coroutines.experimental.buildSequence
// *
// * @sample samples.collections.Sequences.Building.generateSequenceWithLazySeed
// */
//    public fun <T : Any> generateSequence(seedFunction: () -> T?, nextFunction: (T) -> T?): Sequence<T> =
//    GeneratorSequence(seedFunction, nextFunction)

//    /**
//     * Returns `true` if [element] is found in the sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public operator fun <@kotlin.internal.OnlyInputTypes T> Sequence<T>.contains(element: T): Boolean {
//        return indexOf(element) >= 0
//    }
//
//    /**
//     * Returns an element at the given [index] or throws an [IndexOutOfBoundsException] if the [index] is out of bounds of this sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.elementAt(index: Int): T {
//        return elementAtOrElse(index) { throw IndexOutOfBoundsException("Sequence doesn't contain element at index $index.") }
//    }
//
//    /**
//     * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.elementAtOrElse(index: Int, defaultValue: (Int) -> T): T {
//        if (index < 0)
//            return defaultValue(index)
//        val iterator = iterator()
//        var count = 0
//        while (iterator.hasNext()) {
//            val element = iterator.next()
//            if (index == count++)
//                return element
//        }
//        return defaultValue(index)
//    }
//
//    /**
//     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.elementAtOrNull(index: Int): T? {
//        if (index < 0)
//            return null
//        val iterator = iterator()
//        var count = 0
//        while (iterator.hasNext()) {
//            val element = iterator.next()
//            if (index == count++)
//                return element
//        }
//        return null
//    }
//
///**
// * Returns the first element matching the given [predicate], or `null` if no such element was found.
// *
// * The operation is _terminal_.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Sequence<T>.find(predicate: (T) -> Boolean): T? {
//        return firstOrNull(predicate)
//    }
//
///**
// * Returns the last element matching the given [predicate], or `null` if no such element was found.
// *
// * The operation is _terminal_.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Sequence<T>.findLast(predicate: (T) -> Boolean): T? {
//        return lastOrNull(predicate)
//    }
//
//    /**
//     * Returns first element.
//     * @throws [NoSuchElementException] if the sequence is empty.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.first(): T {
//        val iterator = iterator()
//        if (!iterator.hasNext())
//            throw NoSuchElementException("Sequence is empty.")
//        return iterator.next()
//    }
//
//    /**
//     * Returns the first element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.first(predicate: (T) -> Boolean): T {
//        for (element in this) if (predicate(element)) return element
//        throw NoSuchElementException("Sequence contains no element matching the predicate.")
//    }
//
//    /**
//     * Returns the first element, or `null` if the sequence is empty.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.firstOrNull(): T? {
//        val iterator = iterator()
//        if (!iterator.hasNext())
//            return null
//        return iterator.next()
//    }
//
//    /**
//     * Returns the first element matching the given [predicate], or `null` if element was not found.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.firstOrNull(predicate: (T) -> Boolean): T? {
//        for (element in this) if (predicate(element)) return element
//        return null
//    }
//
//    /**
//     * Returns first index of [element], or -1 if the sequence does not contain element.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <@kotlin.internal.OnlyInputTypes T> Sequence<T>.indexOf(element: T): Int {
//        var index = 0
//        for (item in this) {
//            if (element == item)
//                return index
//            index++
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the first element matching the given [predicate], or -1 if the sequence does not contain such element.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.indexOfFirst(predicate: (T) -> Boolean): Int {
//        var index = 0
//        for (item in this) {
//            if (predicate(item))
//                return index
//            index++
//        }
//        return -1
//    }
//
//    /**
//     * Returns index of the last element matching the given [predicate], or -1 if the sequence does not contain such element.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.indexOfLast(predicate: (T) -> Boolean): Int {
//        var lastIndex = -1
//        var index = 0
//        for (item in this) {
//            if (predicate(item))
//                lastIndex = index
//            index++
//        }
//        return lastIndex
//    }
//
//    /**
//     * Returns the last element.
//     * @throws [NoSuchElementException] if the sequence is empty.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.last(): T {
//        val iterator = iterator()
//        if (!iterator.hasNext())
//            throw NoSuchElementException("Sequence is empty.")
//        var last = iterator.next()
//        while (iterator.hasNext())
//            last = iterator.next()
//        return last
//    }
//
//    /**
//     * Returns the last element matching the given [predicate].
//     * @throws [NoSuchElementException] if no such element is found.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.last(predicate: (T) -> Boolean): T {
//        var last: T? = null
//        var found = false
//        for (element in this) {
//            if (predicate(element)) {
//                last = element
//                found = true
//            }
//        }
//        if (!found) throw NoSuchElementException("Sequence contains no element matching the predicate.")
//        @Suppress("UNCHECKED_CAST")
//        return last as T
//    }
//
//    /**
//     * Returns last index of [element], or -1 if the sequence does not contain element.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <@kotlin.internal.OnlyInputTypes T> Sequence<T>.lastIndexOf(element: T): Int {
//        var lastIndex = -1
//        var index = 0
//        for (item in this) {
//            if (element == item)
//                lastIndex = index
//            index++
//        }
//        return lastIndex
//    }
//
//    /**
//     * Returns the last element, or `null` if the sequence is empty.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.lastOrNull(): T? {
//        val iterator = iterator()
//        if (!iterator.hasNext())
//            return null
//        var last = iterator.next()
//        while (iterator.hasNext())
//            last = iterator.next()
//        return last
//    }
//
//    /**
//     * Returns the last element matching the given [predicate], or `null` if no such element was found.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.lastOrNull(predicate: (T) -> Boolean): T? {
//        var last: T? = null
//        for (element in this) {
//            if (predicate(element)) {
//                last = element
//            }
//        }
//        return last
//    }
//
//    /**
//     * Returns the single element, or throws an exception if the sequence is empty or has more than one element.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.single(): T {
//        val iterator = iterator()
//        if (!iterator.hasNext())
//            throw NoSuchElementException("Sequence is empty.")
//        val single = iterator.next()
//        if (iterator.hasNext())
//            throw IllegalArgumentException("Sequence has more than one element.")
//        return single
//    }
//
//    /**
//     * Returns the single element matching the given [predicate], or throws exception if there is no or more than one matching element.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.single(predicate: (T) -> Boolean): T {
//        var single: T? = null
//        var found = false
//        for (element in this) {
//            if (predicate(element)) {
//                if (found) throw IllegalArgumentException("Sequence contains more than one matching element.")
//                single = element
//                found = true
//            }
//        }
//        if (!found) throw NoSuchElementException("Sequence contains no element matching the predicate.")
//        @Suppress("UNCHECKED_CAST")
//        return single as T
//    }
//
//    /**
//     * Returns single element, or `null` if the sequence is empty or has more than one element.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.singleOrNull(): T? {
//        val iterator = iterator()
//        if (!iterator.hasNext())
//            return null
//        val single = iterator.next()
//        if (iterator.hasNext())
//            return null
//        return single
//    }
//
//    /**
//     * Returns the single element matching the given [predicate], or `null` if element was not found or more than one element was found.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.singleOrNull(predicate: (T) -> Boolean): T? {
//        var single: T? = null
//        var found = false
//        for (element in this) {
//            if (predicate(element)) {
//                if (found) return null
//                single = element
//                found = true
//            }
//        }
//        if (!found) return null
//        return single
//    }
//
//    /**
//     * Returns a sequence containing all elements except first [n] elements.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     *
//     * @sample samples.collections.Collections.Transformations.drop
//     */
//    public fun <T> Sequence<T>.drop(n: Int): Sequence<T> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return when {
//            n == 0 -> this
//            this is DropTakeSequence -> this.drop(n)
//        else -> DropSequence(this, n)
//        }
//    }
//
//    /**
//     * Returns a sequence containing all elements except first elements that satisfy the given [predicate].
//     *
//     * The operation is _intermediate_ and _stateless_.
//     *
//     * @sample samples.collections.Collections.Transformations.drop
//     */
//    public fun <T> Sequence<T>.dropWhile(predicate: (T) -> Boolean): Sequence<T> {
//        return DropWhileSequence(this, predicate)
//    }
//
//    /**
//     * Returns a sequence containing only elements matching the given [predicate].
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public fun <T> Sequence<T>.filter(predicate: (T) -> Boolean): Sequence<T> {
//        return FilteringSequence(this, true, predicate)
//    }
//
//    /**
//     * Returns a sequence containing only elements matching the given [predicate].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public fun <T> Sequence<T>.filterIndexed(predicate: (index: Int, T) -> Boolean): Sequence<T> {
//        // TODO: Rewrite with generalized MapFilterIndexingSequence
//        return TransformingSequence(FilteringSequence(IndexingSequence(this), true, { predicate(it.index, it.value) }), { it.value })
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     * @param [predicate] function that takes the index of an element and the element itself
//     * and returns the result of predicate evaluation on the element.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, C : MutableCollection<in T>> Sequence<T>.filterIndexedTo(destination: C, predicate: (index: Int, T) -> Boolean): C {
//        forEachIndexed { index, element ->
//            if (predicate(index, element)) destination.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Returns a sequence containing all elements that are instances of specified type parameter R.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<@kotlin.internal.NoInfer R> {
//        @Suppress("UNCHECKED_CAST")
//        return filter { it is R } as Sequence<R>
//    }
//
//    /**
//     * Appends all elements that are instances of specified type parameter R to the given [destination].
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <reified R, C : MutableCollection<in R>> Sequence<*>.filterIsInstanceTo(destination: C): C {
//        for (element in this) if (element is R) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Returns a sequence containing all elements not matching the given [predicate].
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public fun <T> Sequence<T>.filterNot(predicate: (T) -> Boolean): Sequence<T> {
//        return FilteringSequence(this, false, predicate)
//    }
//
///**
// * Returns a sequence containing all elements that are not `null`.
// *
// * The operation is _intermediate_ and _stateless_.
// */
//    public fun <T : Any> Sequence<T?>.filterNotNull(): Sequence<T> {
//        @Suppress("UNCHECKED_CAST")
//        return filterNot { it == null } as Sequence<T>
//    }
//
///**
// * Appends all elements that are not `null` to the given [destination].
// *
// * The operation is _terminal_.
// */
//    public fun <C : MutableCollection<in T>, T : Any> Sequence<T?>.filterNotNullTo(destination: C): C {
//        for (element in this) if (element != null) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements not matching the given [predicate] to the given [destination].
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, C : MutableCollection<in T>> Sequence<T>.filterNotTo(destination: C, predicate: (T) -> Boolean): C {
//        for (element in this) if (!predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Appends all elements matching the given [predicate] to the given [destination].
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, C : MutableCollection<in T>> Sequence<T>.filterTo(destination: C, predicate: (T) -> Boolean): C {
//        for (element in this) if (predicate(element)) destination.add(element)
//        return destination
//    }
//
//    /**
//     * Returns a sequence containing first [n] elements.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     *
//     * @sample samples.collections.Collections.Transformations.take
//     */
//    public fun <T> Sequence<T>.take(n: Int): Sequence<T> {
//        require(n >= 0) { "Requested element count $n is less than zero." }
//        return when {
//            n == 0 -> emptySequence()
//            this is DropTakeSequence -> this.take(n)
//        else -> TakeSequence(this, n)
//        }
//    }
//
//    /**
//     * Returns a sequence containing first elements satisfying the given [predicate].
//     *
//     * The operation is _intermediate_ and _stateless_.
//     *
//     * @sample samples.collections.Collections.Transformations.take
//     */
//    public fun <T> Sequence<T>.takeWhile(predicate: (T) -> Boolean): Sequence<T> {
//        return TakeWhileSequence(this, predicate)
//    }
//
///**
// * Returns a sequence that yields elements of this sequence sorted according to their natural sort order.
// *
// * The operation is _intermediate_ and _stateful_.
// */
//    public fun <T : Comparable<T>> Sequence<T>.sorted(): Sequence<T> {
//        return object : Sequence<T> {
//            override fun iterator(): Iterator<T> {
//                val sortedList = this@sorted.toMutableList()
//                        sortedList.sort()
//                return sortedList.iterator()
//            }
//        }
//    }
//
//    /**
//     * Returns a sequence that yields elements of this sequence sorted according to natural sort order of the value returned by specified [selector] function.
//     *
//     * The operation is _intermediate_ and _stateful_.
//     */
//    public inline fun <T, R : Comparable<R>> Sequence<T>.sortedBy(crossinline selector: (T) -> R?): Sequence<T> {
//        return sortedWith(compareBy(selector))
//    }
//
//    /**
//     * Returns a sequence that yields elements of this sequence sorted descending according to natural sort order of the value returned by specified [selector] function.
//     *
//     * The operation is _intermediate_ and _stateful_.
//     */
//    public inline fun <T, R : Comparable<R>> Sequence<T>.sortedByDescending(crossinline selector: (T) -> R?): Sequence<T> {
//        return sortedWith(compareByDescending(selector))
//    }
//
///**
// * Returns a sequence that yields elements of this sequence sorted descending according to their natural sort order.
// *
// * The operation is _intermediate_ and _stateful_.
// */
//    public fun <T : Comparable<T>> Sequence<T>.sortedDescending(): Sequence<T> {
//        return sortedWith(reverseOrder())
//    }
//
//    /**
//     * Returns a sequence that yields elements of this sequence sorted according to the specified [comparator].
//     *
//     * The operation is _intermediate_ and _stateful_.
//     */
//    public fun <T> Sequence<T>.sortedWith(comparator: Comparator<in T>): Sequence<T> {
//        return object : Sequence<T> {
//            override fun iterator(): Iterator<T> {
//                val sortedList = this@sortedWith.toMutableList()
//                        sortedList.sortWith(comparator)
//                return sortedList.iterator()
//            }
//        }
//    }
//
//    /**
//     * Returns a [Map] containing key-value pairs provided by [transform] function
//     * applied to elements of the given sequence.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, K, V> Sequence<T>.associate(transform: (T) -> Pair<K, V>): Map<K, V> {
//        return associateTo(LinkedHashMap<K, V>(), transform)
//    }
//
//    /**
//     * Returns a [Map] containing the elements from the given sequence indexed by the key
//     * returned from [keySelector] function applied to each element.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, K> Sequence<T>.associateBy(keySelector: (T) -> K): Map<K, T> {
//        return associateByTo(LinkedHashMap<K, T>(), keySelector)
//    }
//
//    /**
//     * Returns a [Map] containing the values provided by [valueTransform] and indexed by [keySelector] functions applied to elements of the given sequence.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The returned map preserves the entry iteration order of the original sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, K, V> Sequence<T>.associateBy(keySelector: (T) -> K, valueTransform: (T) -> V): Map<K, V> {
//        return associateByTo(LinkedHashMap<K, V>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function applied to each element of the given sequence
//     * and value is the element itself.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, K, M : MutableMap<in K, in T>> Sequence<T>.associateByTo(destination: M, keySelector: (T) -> K): M {
//        for (element in this) {
//            destination.put(keySelector(element), element)
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs,
//     * where key is provided by the [keySelector] function and
//     * and value is provided by the [valueTransform] function applied to elements of the given sequence.
//     *
//     * If any two elements would have the same key returned by [keySelector] the last one gets added to the map.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, K, V, M : MutableMap<in K, in V>> Sequence<T>.associateByTo(destination: M, keySelector: (T) -> K, valueTransform: (T) -> V): M {
//        for (element in this) {
//            destination.put(keySelector(element), valueTransform(element))
//        }
//        return destination
//    }
//
//    /**
//     * Populates and returns the [destination] mutable map with key-value pairs
//     * provided by [transform] function applied to each element of the given sequence.
//     *
//     * If any of two pairs would have the same key the last one gets added to the map.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, K, V, M : MutableMap<in K, in V>> Sequence<T>.associateTo(destination: M, transform: (T) -> Pair<K, V>): M {
//        for (element in this) {
//            destination += transform(element)
//        }
//        return destination
//    }
//

    /**
     * Appends all elements to the given [destination] collection.
     * <p>
     * The operation is _terminal_.
     */
    public static <T, C extends Collection<T>> C toCollection(@Nullable Sequence<T> sequence, @NotNull C destination) {
        if (sequence != null) {
            Iterator<T> iterator = sequence.iterator();
            while (iterator.hasNext()) {
                T element = iterator.next();
                destination.add(element);
            }
        }
        return destination;
    }

    /**
     * Returns a [HashSet] of all elements.
     * <p>
     * The operation is _terminal_.
     */
    public static <T> HashSet<T> toHashSet(@Nullable Sequence<T> sequence) {
        return toCollection(sequence, new HashSet<T>());
    }

    /**
     * Returns a [List] containing all elements.
     * <p>
     * The operation is _terminal_.
     */
    public static <T> List<T> toList(@NotNull Sequence<T> sequence) {
        return toCollection(sequence, new ArrayList<T>());
    }

    /**
     * Returns a [MutableList] filled with all elements of this sequence.
     * <p>
     * The operation is _terminal_.
     */
    public static <T> List<T> toMutableList(@NotNull Sequence<T> sequence) {
        return toCollection(sequence, new ArrayList<T>());
    }
//
//    /**
//     * Returns a [Set] of all elements.
//     *
//     * The returned set preserves the element iteration order of the original sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.toSet(): Set<T> {
//        return toCollection(LinkedHashSet<T>()).optimizeReadOnlySet()
//    }
//
//    /**
//     * Returns a single sequence of all elements from results of [transform] function being invoked on each element of original sequence.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public fun <T, R> Sequence<T>.flatMap(transform: (T) -> Sequence<R>): Sequence<R> {
//        return FlatteningSequence(this, transform, { it.iterator() })
//    }
//
//    /**
//     * Appends all elements yielded from results of [transform] function being invoked on each element of original sequence, to the given [destination].
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, R, C : MutableCollection<in R>> Sequence<T>.flatMapTo(destination: C, transform: (T) -> Sequence<R>): C {
//        for (element in this) {
//            val list = transform(element)
//            destination.addAll(list)
//        }
//        return destination
//    }
//
//    /**
//     * Groups elements of the original sequence by the key returned by the given [keySelector] function
//     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original sequence.
//     *
//     * The operation is _terminal_.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <T, K> Sequence<T>.groupBy(keySelector: (T) -> K): Map<K, List<T>> {
//        return groupByTo(LinkedHashMap<K, MutableList<T>>(), keySelector)
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original sequence
//     * by the key returned by the given [keySelector] function applied to the element
//     * and returns a map where each group key is associated with a list of corresponding values.
//     *
//     * The returned map preserves the entry iteration order of the keys produced from the original sequence.
//     *
//     * The operation is _terminal_.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <T, K, V> Sequence<T>.groupBy(keySelector: (T) -> K, valueTransform: (T) -> V): Map<K, List<V>> {
//        return groupByTo(LinkedHashMap<K, MutableList<V>>(), keySelector, valueTransform)
//    }
//
//    /**
//     * Groups elements of the original sequence by the key returned by the given [keySelector] function
//     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
//     *
//     * @return The [destination] map.
//     *
//     * The operation is _terminal_.
//     *
//     * @sample samples.collections.Collections.Transformations.groupBy
//     */
//    public inline fun <T, K, M : MutableMap<in K, MutableList<T>>> Sequence<T>.groupByTo(destination: M, keySelector: (T) -> K): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<T>() }
//            list.add(element)
//        }
//        return destination
//    }
//
//    /**
//     * Groups values returned by the [valueTransform] function applied to each element of the original sequence
//     * by the key returned by the given [keySelector] function applied to the element
//     * and puts to the [destination] map each group key associated with a list of corresponding values.
//     *
//     * @return The [destination] map.
//     *
//     * The operation is _terminal_.
//     *
//     * @sample samples.collections.Collections.Transformations.groupByKeysAndValues
//     */
//    public inline fun <T, K, V, M : MutableMap<in K, MutableList<V>>> Sequence<T>.groupByTo(destination: M, keySelector: (T) -> K, valueTransform: (T) -> V): M {
//        for (element in this) {
//            val key = keySelector(element)
//            val list = destination.getOrPut(key) { ArrayList<V>() }
//            list.add(valueTransform(element))
//        }
//        return destination
//    }
//
///**
// * Creates a [Grouping] source from a sequence to be used later with one of group-and-fold operations
// * using the specified [keySelector] function to extract a key from each element.
// *
// * The operation is _intermediate_ and _stateless_.
// *
// * @sample samples.collections.Collections.Transformations.groupingByEachCount
// */
//    @SinceKotlin("1.1")
//    public inline fun <T, K> Sequence<T>.groupingBy(crossinline keySelector: (T) -> K): Grouping<T, K> {
//        return object : Grouping<T, K> {
//            override fun sourceIterator(): Iterator<T> = this@groupingBy.iterator()
//            override fun keyOf(element: T): K = keySelector(element)
//        }
//    }
//

    /**
     * Returns a sequence containing the results of applying the given [transform] function
     * to each element in the original sequence.
     * <p>
     * The operation is _intermediate_ and _stateless_.
     */
    @NotNull
    public static <T, R> Sequence<R> map(@NotNull Sequence<T> sequence, @NotNull Transformer<T, R> transform) {
        return new TransformingSequence<>(sequence, transform);
    }
//
//    /**
//     * Returns a sequence containing the results of applying the given [transform] function
//     * to each element and its index in the original sequence.
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public fun <T, R> Sequence<T>.mapIndexed(transform: (index: Int, T) -> R): Sequence<R> {
//        return TransformingIndexedSequence(this, transform)
//    }
//
///**
// * Returns a sequence containing only the non-null results of applying the given [transform] function
// * to each element and its index in the original sequence.
// * @param [transform] function that takes the index of an element and the element itself
// * and returns the result of the transform applied to the element.
// *
// * The operation is _intermediate_ and _stateless_.
// */
//    public fun <T, R : Any> Sequence<T>.mapIndexedNotNull(transform: (index: Int, T) -> R?): Sequence<R> {
//        return TransformingIndexedSequence(this, transform).filterNotNull()
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original sequence
//     * and appends only the non-null results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, R : Any, C : MutableCollection<in R>> Sequence<T>.mapIndexedNotNullTo(destination: C, transform: (index: Int, T) -> R?): C {
//        forEachIndexed { index, element -> transform(index, element)?.let { destination.add(it) } }
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element and its index in the original sequence
//     * and appends the results to the given [destination].
//     * @param [transform] function that takes the index of an element and the element itself
//     * and returns the result of the transform applied to the element.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, R, C : MutableCollection<in R>> Sequence<T>.mapIndexedTo(destination: C, transform: (index: Int, T) -> R): C {
//        var index = 0
//        for (item in this)
//            destination.add(transform(index++, item))
//        return destination
//    }
//
///**
// * Returns a sequence containing only the non-null results of applying the given [transform] function
// * to each element in the original sequence.
// *
// * The operation is _intermediate_ and _stateless_.
// */
//    public fun <T, R : Any> Sequence<T>.mapNotNull(transform: (T) -> R?): Sequence<R> {
//        return TransformingSequence(this, transform).filterNotNull()
//    }
//
//    /**
//     * Applies the given [transform] function to each element in the original sequence
//     * and appends only the non-null results to the given [destination].
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, R : Any, C : MutableCollection<in R>> Sequence<T>.mapNotNullTo(destination: C, transform: (T) -> R?): C {
//        forEach { element -> transform(element)?.let { destination.add(it) } }
//        return destination
//    }
//
//    /**
//     * Applies the given [transform] function to each element of the original sequence
//     * and appends the results to the given [destination].
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, R, C : MutableCollection<in R>> Sequence<T>.mapTo(destination: C, transform: (T) -> R): C {
//        for (item in this)
//            destination.add(transform(item))
//        return destination
//    }
//
//    /**
//     * Returns a sequence of [IndexedValue] for each element of the original sequence.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public fun <T> Sequence<T>.withIndex(): Sequence<IndexedValue<T>> {
//        return IndexingSequence(this)
//    }
//
//    /**
//     * Returns a sequence containing only distinct elements from the given sequence.
//     *
//     * The elements in the resulting sequence are in the same order as they were in the source sequence.
//     *
//     * The operation is _intermediate_ and _stateful_.
//     */
//    public fun <T> Sequence<T>.distinct(): Sequence<T> {
//        return this.distinctBy { it }
//    }
//
//    /**
//     * Returns a sequence containing only elements from the given sequence
//     * having distinct keys returned by the given [selector] function.
//     *
//     * The elements in the resulting sequence are in the same order as they were in the source sequence.
//     *
//     * The operation is _intermediate_ and _stateful_.
//     */
//    public fun <T, K> Sequence<T>.distinctBy(selector: (T) -> K): Sequence<T> {
//        return DistinctSequence(this, selector)
//    }
//
//    /**
//     * Returns a mutable set containing all distinct elements from the given sequence.
//     *
//     * The returned set preserves the element iteration order of the original sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.toMutableSet(): MutableSet<T> {
//        val set = LinkedHashSet<T>()
//        for (item in this) set.add(item)
//        return set
//    }
//
//    /**
//     * Returns `true` if all elements match the given [predicate].
//     *
//     * The operation is _terminal_.
//     *
//     * @sample samples.collections.Collections.Aggregates.all
//     */
//    public inline fun <T> Sequence<T>.all(predicate: (T) -> Boolean): Boolean {
//        for (element in this) if (!predicate(element)) return false
//        return true
//    }
//
//    /**
//     * Returns `true` if sequence has at least one element.
//     *
//     * The operation is _terminal_.
//     *
//     * @sample samples.collections.Collections.Aggregates.any
//     */
//    public fun <T> Sequence<T>.any(): Boolean {
//        return iterator().hasNext()
//    }
//
//    /**
//     * Returns `true` if at least one element matches the given [predicate].
//     *
//     * The operation is _terminal_.
//     *
//     * @sample samples.collections.Collections.Aggregates.anyWithPredicate
//     */
//    public inline fun <T> Sequence<T>.any(predicate: (T) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return true
//        return false
//    }
//

    /**
     * Returns the number of elements in this sequence.
     * <p>
     * The operation is _terminal_.
     */
    public static <T> int count(@Nullable Sequence<T> sequence) {
        int count = 0;
        if (sequence != null) {
            Iterator<T> iterator = sequence.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of elements matching the given [predicate].
     * <p>
     * The operation is _terminal_.
     */
    public static <T> int count(@Nullable Sequence<T> sequence, @NotNull Predicate<T> predicate) {
        int count = 0;
        if (sequence != null) {
            Iterator<T> iterator = sequence.iterator();
            while (iterator.hasNext()) {
                T element = iterator.next();
                if (predicate.accept(element)) count++;
            }
        }
        return count;
    }


    /**
     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
     * <p>
     * The operation is _terminal_.
     */
    @NotNull
    public static <T, R> R fold(@Nullable Sequence<T> sequence, @NotNull R initial, @NotNull Operation<T, R> operation) {
        R accumulator = initial;
        if (sequence != null) {
            Iterator<T> iterator = sequence.iterator();
            while (iterator.hasNext()) {
                T element = iterator.next();
                accumulator = operation.operation(accumulator, element);
            }
        }
        return accumulator;
    }

//    /**
//     * Accumulates value starting with [initial] value and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original sequence.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself, and calculates the next accumulator value.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, R> Sequence<T>.foldIndexed(initial: R, operation: (index: Int, acc: R, T) -> R): R {
//        var index = 0
//        var accumulator = initial
//        for (element in this) accumulator = operation(index++, accumulator, element)
//        return accumulator
//    }
//
//    /**
//     * Performs the given [action] on each element.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.forEach(action: (T) -> Unit): Unit {
//        for (element in this) action(element)
//    }
//
//    /**
//     * Performs the given [action] on each element, providing sequential index with the element.
//     * @param [action] function that takes the index of an element and the element itself
//     * and performs the desired action on the element.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.forEachIndexed(action: (index: Int, T) -> Unit): Unit {
//        var index = 0
//        for (item in this) action(index++, item)
//    }
//
///**
// * Returns the largest element or `null` if there are no elements.
// *
// * If any of elements is `NaN` returns `NaN`.
// *
// * The operation is _terminal_.
// */
//    @SinceKotlin("1.1")
//    public fun Sequence<Double>.max(): Double? {
//        val iterator = iterator()
//        if (!iterator.hasNext()) return null
//        var max = iterator.next()
//        if (max.isNaN()) return max
//        while (iterator.hasNext()) {
//            val e = iterator.next()
//            if (e.isNaN()) return e
//            if (max < e) max = e
//        }
//        return max
//    }
//
///**
// * Returns the largest element or `null` if there are no elements.
// *
// * If any of elements is `NaN` returns `NaN`.
// *
// * The operation is _terminal_.
// */
//    @SinceKotlin("1.1")
//    public fun Sequence<Float>.max(): Float? {
//        val iterator = iterator()
//        if (!iterator.hasNext()) return null
//        var max = iterator.next()
//        if (max.isNaN()) return max
//        while (iterator.hasNext()) {
//            val e = iterator.next()
//            if (e.isNaN()) return e
//            if (max < e) max = e
//        }
//        return max
//    }
//
///**
// * Returns the largest element or `null` if there are no elements.
// *
// * The operation is _terminal_.
// */
//    public fun <T : Comparable<T>> Sequence<T>.max(): T? {
//        val iterator = iterator()
//        if (!iterator.hasNext()) return null
//        var max = iterator.next()
//        while (iterator.hasNext()) {
//            val e = iterator.next()
//            if (max < e) max = e
//        }
//        return max
//    }
//
//    /**
//     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, R : Comparable<R>> Sequence<T>.maxBy(selector: (T) -> R): T? {
//        val iterator = iterator()
//        if (!iterator.hasNext()) return null
//        var maxElem = iterator.next()
//        var maxValue = selector(maxElem)
//        while (iterator.hasNext()) {
//            val e = iterator.next()
//            val v = selector(e)
//            if (maxValue < v) {
//                maxElem = e
//                maxValue = v
//            }
//        }
//        return maxElem
//    }
//
//    /**
//     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.maxWith(comparator: Comparator<in T>): T? {
//        val iterator = iterator()
//        if (!iterator.hasNext()) return null
//        var max = iterator.next()
//        while (iterator.hasNext()) {
//            val e = iterator.next()
//            if (comparator.compare(max, e) < 0) max = e
//        }
//        return max
//    }
//
///**
// * Returns the smallest element or `null` if there are no elements.
// *
// * If any of elements is `NaN` returns `NaN`.
// *
// * The operation is _terminal_.
// */
//    @SinceKotlin("1.1")
//    public fun Sequence<Double>.min(): Double? {
//        val iterator = iterator()
//        if (!iterator.hasNext()) return null
//        var min = iterator.next()
//        if (min.isNaN()) return min
//        while (iterator.hasNext()) {
//            val e = iterator.next()
//            if (e.isNaN()) return e
//            if (min > e) min = e
//        }
//        return min
//    }
//
///**
// * Returns the smallest element or `null` if there are no elements.
// *
// * If any of elements is `NaN` returns `NaN`.
// *
// * The operation is _terminal_.
// */
//    @SinceKotlin("1.1")
//    public fun Sequence<Float>.min(): Float? {
//        val iterator = iterator()
//        if (!iterator.hasNext()) return null
//        var min = iterator.next()
//        if (min.isNaN()) return min
//        while (iterator.hasNext()) {
//            val e = iterator.next()
//            if (e.isNaN()) return e
//            if (min > e) min = e
//        }
//        return min
//    }
//
///**
// * Returns the smallest element or `null` if there are no elements.
// *
// * The operation is _terminal_.
// */
//    public fun <T : Comparable<T>> Sequence<T>.min(): T? {
//        val iterator = iterator()
//        if (!iterator.hasNext()) return null
//        var min = iterator.next()
//        while (iterator.hasNext()) {
//            val e = iterator.next()
//            if (min > e) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T, R : Comparable<R>> Sequence<T>.minBy(selector: (T) -> R): T? {
//        val iterator = iterator()
//        if (!iterator.hasNext()) return null
//        var minElem = iterator.next()
//        var minValue = selector(minElem)
//        while (iterator.hasNext()) {
//            val e = iterator.next()
//            val v = selector(e)
//            if (minValue > v) {
//                minElem = e
//                minValue = v
//            }
//        }
//        return minElem
//    }
//
//    /**
//     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
//     *
//     * The operation is _terminal_.
//     */
//    public fun <T> Sequence<T>.minWith(comparator: Comparator<in T>): T? {
//        val iterator = iterator()
//        if (!iterator.hasNext()) return null
//        var min = iterator.next()
//        while (iterator.hasNext()) {
//            val e = iterator.next()
//            if (comparator.compare(min, e) > 0) min = e
//        }
//        return min
//    }
//
//    /**
//     * Returns `true` if the sequence has no elements.
//     *
//     * The operation is _terminal_.
//     *
//     * @sample samples.collections.Collections.Aggregates.none
//     */
//    public fun <T> Sequence<T>.none(): Boolean {
//        return !iterator().hasNext()
//    }
//
//    /**
//     * Returns `true` if no elements match the given [predicate].
//     *
//     * The operation is _terminal_.
//     *
//     * @sample samples.collections.Collections.Aggregates.noneWithPredicate
//     */
//    public inline fun <T> Sequence<T>.none(predicate: (T) -> Boolean): Boolean {
//        for (element in this) if (predicate(element)) return false
//        return true
//    }
//
///**
// * Returns a sequence which performs the given [action] on each element of the original sequence as they pass through it.
// *
// * The operation is _intermediate_ and _stateless_.
// */
//    @SinceKotlin("1.1")
//    public fun <T> Sequence<T>.onEach(action: (T) -> Unit): Sequence<T> {
//        return map {
//            action(it)
//            it
//        }
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <S, T : S> Sequence<T>.reduce(operation: (acc: S, T) -> S): S {
//        val iterator = this.iterator()
//        if (!iterator.hasNext()) throw UnsupportedOperationException("Empty sequence can't be reduced.")
//        var accumulator: S = iterator.next()
//        while (iterator.hasNext()) {
//            accumulator = operation(accumulator, iterator.next())
//        }
//        return accumulator
//    }
//
//    /**
//     * Accumulates value starting with the first element and applying [operation] from left to right
//     * to current accumulator value and each element with its index in the original sequence.
//     * @param [operation] function that takes the index of an element, current accumulator value
//     * and the element itself and calculates the next accumulator value.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <S, T : S> Sequence<T>.reduceIndexed(operation: (index: Int, acc: S, T) -> S): S {
//        val iterator = this.iterator()
//        if (!iterator.hasNext()) throw UnsupportedOperationException("Empty sequence can't be reduced.")
//        var index = 1
//        var accumulator: S = iterator.next()
//        while (iterator.hasNext()) {
//            accumulator = operation(index++, accumulator, iterator.next())
//        }
//        return accumulator
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.sumBy(selector: (T) -> Int): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
//    /**
//     * Returns the sum of all values produced by [selector] function applied to each element in the sequence.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.sumByDouble(selector: (T) -> Double): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += selector(element)
//        }
//        return sum
//    }
//
///**
// * Returns an original collection containing all the non-`null` elements, throwing an [IllegalArgumentException] if there are any `null` elements.
// *
// * The operation is _intermediate_ and _stateless_.
// */
//    public fun <T : Any> Sequence<T?>.requireNoNulls(): Sequence<T> {
//        return map { it ?: throw IllegalArgumentException("null element found in $this.") }
//    }
//
///**
// * Splits this sequence into a sequence of lists each not exceeding the given [size].
// *
// * The last list in the resulting sequence may have less elements than the given [size].
// *
// * @param size the number of elements to take in each list, must be positive and can be greater than the number of elements in this sequence.
// *
// * The operation is _intermediate_ and _stateful_.
// *
// * @sample samples.collections.Collections.Transformations.chunked
// */
//    @SinceKotlin("1.2")
//    public fun <T> Sequence<T>.chunked(size: Int): Sequence<List<T>> {
//        return windowed(size, size, partialWindows = true)
//    }
//
///**
// * Splits this sequence into several lists each not exceeding the given [size]
// * and applies the given [transform] function to an each.
// *
// * @return sequence of results of the [transform] applied to an each list.
// *
// * Note that the list passed to the [transform] function is ephemeral and is valid only inside that function.
// * You should not store it or allow it to escape in some way, unless you made a snapshot of it.
// * The last list may have less elements than the given [size].
// *
// * @param size the number of elements to take in each list, must be positive and can be greater than the number of elements in this sequence.
// *
// * The operation is _intermediate_ and _stateful_.
// *
// * @sample samples.text.Strings.chunkedTransform
// */
//    @SinceKotlin("1.2")
//    public fun <T, R> Sequence<T>.chunked(size: Int, transform: (List<T>) -> R): Sequence<R> {
//        return windowed(size, size, partialWindows = true, transform = transform)
//    }
//
//    /**
//     * Returns a sequence containing all elements of the original sequence without the first occurrence of the given [element].
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public operator fun <T> Sequence<T>.minus(element: T): Sequence<T> {
//        return object: Sequence<T> {
//            override fun iterator(): Iterator<T> {
//                var removed = false
//                return this@minus.filter { if (!removed && it == element) { removed = true; false } else true }.iterator()
//            }
//        }
//    }
//
//    /**
//     * Returns a sequence containing all elements of original sequence except the elements contained in the given [elements] array.
//     *
//     * Note that the source sequence and the array being subtracted are iterated only when an `iterator` is requested from
//     * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
//     *
//     * The operation is _intermediate_ and _stateful_.
//     */
//    public operator fun <T> Sequence<T>.minus(elements: Array<out T>): Sequence<T> {
//        if (elements.isEmpty()) return this
//        return object: Sequence<T> {
//            override fun iterator(): Iterator<T> {
//                val other = elements.toHashSet()
//                return this@minus.filterNot { it in other }.iterator()
//            }
//        }
//    }
//
//    /**
//     * Returns a sequence containing all elements of original sequence except the elements contained in the given [elements] collection.
//     *
//     * Note that the source sequence and the collection being subtracted are iterated only when an `iterator` is requested from
//     * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
//     *
//     * The operation is _intermediate_ and _stateful_.
//     */
//    public operator fun <T> Sequence<T>.minus(elements: Iterable<T>): Sequence<T> {
//        return object: Sequence<T> {
//            override fun iterator(): Iterator<T> {
//                val other = elements.convertToSetForSetOperation()
//                if (other.isEmpty())
//                    return this@minus.iterator()
//            else
//                return this@minus.filterNot { it in other }.iterator()
//            }
//        }
//    }
//
//    /**
//     * Returns a sequence containing all elements of original sequence except the elements contained in the given [elements] sequence.
//     *
//     * Note that the source sequence and the sequence being subtracted are iterated only when an `iterator` is requested from
//     * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
//     *
//     * The operation is _intermediate_ for this sequence and _terminal_ and _stateful_ for the [elements] sequence.
//     */
//    public operator fun <T> Sequence<T>.minus(elements: Sequence<T>): Sequence<T> {
//        return object: Sequence<T> {
//            override fun iterator(): Iterator<T> {
//                val other = elements.toHashSet()
//                if (other.isEmpty())
//                    return this@minus.iterator()
//            else
//                return this@minus.filterNot { it in other }.iterator()
//            }
//        }
//    }
//
///**
// * Returns a sequence containing all elements of the original sequence without the first occurrence of the given [element].
// *
// * The operation is _intermediate_ and _stateless_.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Sequence<T>.minusElement(element: T): Sequence<T> {
//        return minus(element)
//    }
//
//    /**
//     * Splits the original sequence into pair of lists,
//     * where *first* list contains elements for which [predicate] yielded `true`,
//     * while *second* list contains elements for which [predicate] yielded `false`.
//     *
//     * The operation is _terminal_.
//     */
//    public inline fun <T> Sequence<T>.partition(predicate: (T) -> Boolean): Pair<List<T>, List<T>> {
//        val first = ArrayList<T>()
//        val second = ArrayList<T>()
//        for (element in this) {
//            if (predicate(element)) {
//                first.add(element)
//            } else {
//                second.add(element)
//            }
//        }
//        return Pair(first, second)
//    }
//
//    /**
//     * Returns a sequence containing all elements of the original sequence and then the given [element].
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public operator fun <T> Sequence<T>.plus(element: T): Sequence<T> {
//        return sequenceOf(this, sequenceOf(element)).flatten()
//    }
//
//    /**
//     * Returns a sequence containing all elements of original sequence and then all elements of the given [elements] array.
//     *
//     * Note that the source sequence and the array being added are iterated only when an `iterator` is requested from
//     * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public operator fun <T> Sequence<T>.plus(elements: Array<out T>): Sequence<T> {
//        return this.plus(elements.asList())
//    }
//
//    /**
//     * Returns a sequence containing all elements of original sequence and then all elements of the given [elements] collection.
//     *
//     * Note that the source sequence and the collection being added are iterated only when an `iterator` is requested from
//     * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public operator fun <T> Sequence<T>.plus(elements: Iterable<T>): Sequence<T> {
//        return sequenceOf(this, elements.asSequence()).flatten()
//    }
//
//    /**
//     * Returns a sequence containing all elements of original sequence and then all elements of the given [elements] sequence.
//     *
//     * Note that the source sequence and the sequence being added are iterated only when an `iterator` is requested from
//     * the resulting sequence. Changing any of them between successive calls to `iterator` may affect the result.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     */
//    public operator fun <T> Sequence<T>.plus(elements: Sequence<T>): Sequence<T> {
//        return sequenceOf(this, elements).flatten()
//    }
//
///**
// * Returns a sequence containing all elements of the original sequence and then the given [element].
// *
// * The operation is _intermediate_ and _stateless_.
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Sequence<T>.plusElement(element: T): Sequence<T> {
//        return plus(element)
//    }
//
///**
// * Returns a sequence of snapshots of the window of the given [size]
// * sliding along this sequence with the given [step], where each
// * snapshot is a list.
// *
// * Several last lists may have less elements than the given [size].
// *
// * Both [size] and [step] must be positive and can be greater than the number of elements in this sequence.
// * @param size the number of elements to take in each window
// * @param step the number of elements to move the window forward by on an each step, by default 1
// * @param partialWindows controls whether or not to keep partial windows in the end if any,
// * by default `false` which means partial windows won't be preserved
// *
// * @sample samples.collections.Sequences.Transformations.takeWindows
// */
//    @SinceKotlin("1.2")
//    public fun <T> Sequence<T>.windowed(size: Int, step: Int = 1, partialWindows: Boolean = false): Sequence<List<T>> {
//        return windowedSequence(size, step, partialWindows, reuseBuffer = false)
//    }
//
///**
// * Returns a sequence of results of applying the given [transform] function to
// * an each list representing a view over the window of the given [size]
// * sliding along this sequence with the given [step].
// *
// * Note that the list passed to the [transform] function is ephemeral and is valid only inside that function.
// * You should not store it or allow it to escape in some way, unless you made a snapshot of it.
// * Several last lists may have less elements than the given [size].
// *
// * Both [size] and [step] must be positive and can be greater than the number of elements in this sequence.
// * @param size the number of elements to take in each window
// * @param step the number of elements to move the window forward by on an each step, by default 1
// * @param partialWindows controls whether or not to keep partial windows in the end if any,
// * by default `false` which means partial windows won't be preserved
// *
// * @sample samples.collections.Sequences.Transformations.averageWindows
// */
//    @SinceKotlin("1.2")
//    public fun <T, R> Sequence<T>.windowed(size: Int, step: Int = 1, partialWindows: Boolean = false, transform: (List<T>) -> R): Sequence<R> {
//        return windowedSequence(size, step, partialWindows, reuseBuffer = true).map(transform)
//    }
//
//    /**
//     * Returns a sequence of values built from the elements of `this` sequence and the [other] sequence with the same index.
//     * The resulting sequence ends as soon as the shortest input sequence ends.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     *
//     * @sample samples.collections.Sequences.Transformations.zip
//     */
//    public infix fun <T, R> Sequence<T>.zip(other: Sequence<R>): Sequence<Pair<T, R>> {
//        return MergingSequence(this, other) { t1, t2 -> t1 to t2 }
//    }
//
//    /**
//     * Returns a sequence of values built from the elements of `this` sequence and the [other] sequence with the same index
//     * using the provided [transform] function applied to each pair of elements.
//     * The resulting sequence ends as soon as the shortest input sequence ends.
//     *
//     * The operation is _intermediate_ and _stateless_.
//     *
//     * @sample samples.collections.Sequences.Transformations.zipWithTransform
//     */
//    public fun <T, R, V> Sequence<T>.zip(other: Sequence<R>, transform: (a: T, b: R) -> V): Sequence<V> {
//        return MergingSequence(this, other, transform)
//    }
//
///**
// * Returns a sequence of pairs of each two adjacent elements in this sequence.
// *
// * The returned sequence is empty if this sequence contains less than two elements.
// *
// * The operation is _intermediate_ and _stateless_.
// *
// * @sample samples.collections.Collections.Transformations.zipWithNext
// */
//    @SinceKotlin("1.2")
//    public fun <T> Sequence<T>.zipWithNext(): Sequence<Pair<T, T>> {
//        return zipWithNext { a, b -> a to b }
//    }
//
///**
// * Returns a sequence containing the results of applying the given [transform] function
// * to an each pair of two adjacent elements in this sequence.
// *
// * The returned sequence is empty if this sequence contains less than two elements.
// *
// * The operation is _intermediate_ and _stateless_.
// *
// * @sample samples.collections.Collections.Transformations.zipWithNextToFindDeltas
// */
//    @SinceKotlin("1.2")
//    public fun <T, R> Sequence<T>.zipWithNext(transform: (a: T, b: T) -> R): Sequence<R> {
//        return buildSequence result@ {
//            val iterator = iterator()
//            if (!iterator.hasNext()) return@result
//                    var current = iterator.next()
//            while (iterator.hasNext()) {
//                val next = iterator.next()
//                yield(transform(current, next))
//                current = next
//            }
//        }
//    }
//

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     * <p>
     * The operation is _terminal_.
     */
    public static <T, A extends Appendable> A joinTo(@Nullable Sequence<T> sequence, @NotNull A buffer, @Nullable CharSequence separator,
                                                     @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                                     @Nullable CharSequence truncated, @Nullable Transformer<T, CharSequence> transform) {
        if (separator == null) separator = ", ";
        if (prefix == null) prefix = "";
        if (postfix == null) postfix = "";
        if (truncated == null) truncated = "...";

        try {
            buffer.append(prefix);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count = 0;
        if (sequence != null) {
            Iterator<T> iterator = sequence.iterator();
            while (iterator.hasNext()) {
                T element = iterator.next();
                if (++count > 1) {
                    try {
                        buffer.append(separator);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (limit < 0 || count <= limit) {
                    StringBuilderx.appendElement(buffer, element, transform);
                } else {
                    break;
                }
            }
        }
        if (limit >= 0 && count > limit) {
            try {
                buffer.append(truncated);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            buffer.append(postfix);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     * <p>
     * The operation is _terminal_.
     */
    public static <T, A extends Appendable> A joinTo(@Nullable Sequence<T> sequence, @NotNull A buffer, @Nullable Transformer<T, CharSequence> transform) {
        return joinTo(sequence, buffer, null, null, null, -1, null, transform);
    }

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     * <p>
     * The operation is _terminal_.
     */
    public static <T, A extends Appendable> A joinTo(@Nullable Sequence<T> sequence, @NotNull A buffer, @Nullable CharSequence separator) {
        return joinTo(sequence, buffer, separator, null, null, -1, null, null);
    }

    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     * <p>
     * The operation is _terminal_.
     */
    public static <T, A extends Appendable> A joinTo(@Nullable Sequence<T> sequence, @NotNull A buffer) {
        return joinTo(sequence, buffer, null, null, null, -1, null, null);
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     * <p>
     * The operation is _terminal_.
     */
    public static <T> String joinToString(@Nullable Sequence<T> sequence, @Nullable CharSequence separator,
                                          @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                          @Nullable CharSequence truncated, @Nullable Transformer<T, CharSequence> transform) {
        return joinTo(sequence, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString();
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     * <p>
     * The operation is _terminal_.
     */
    public static <T> String joinToString(@Nullable Sequence<T> sequence, @Nullable Transformer<T, CharSequence> transform) {
        return joinTo(sequence, new StringBuilder(), null, null, null, -1, null, transform).toString();
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     * <p>
     * The operation is _terminal_.
     */
    public static <T> String joinToString(@Nullable Sequence<T> sequence, @Nullable CharSequence separator) {
        return joinTo(sequence, new StringBuilder(), separator, null, null, -1, null, null).toString();
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     * <p>
     * The operation is _terminal_.
     */
    public static <T> String joinToString(@Nullable Sequence<T> sequence) {
        return joinTo(sequence, new StringBuilder(), null, null, null, -1, null, null).toString();
    }


    /**
     * Creates an [Iterable] instance that wraps the original sequence returning its elements when being iterated.
     */
    @NotNull
    public static <T> Iterable<T> asIterable(@NotNull final Sequence<T> sequence) {
        return new Iterable<T>() {
            @NotNull
            @Override
            public Iterator<T> iterator() {
                return sequence.iterator();
            }
        };
    }

///**
// * Returns this sequence as a [Sequence].
// */
//    @kotlin.internal.InlineOnly
//    public inline fun <T> Sequence<T>.asSequence(): Sequence<T> {
//        return this
//    }
//
///**
// * Returns an average value of elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("averageOfByte")
//    public fun Sequence<Byte>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
///**
// * Returns an average value of elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("averageOfShort")
//    public fun Sequence<Short>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
///**
// * Returns an average value of elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("averageOfInt")
//    public fun Sequence<Int>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
///**
// * Returns an average value of elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("averageOfLong")
//    public fun Sequence<Long>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
///**
// * Returns an average value of elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("averageOfFloat")
//    public fun Sequence<Float>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
///**
// * Returns an average value of elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("averageOfDouble")
//    public fun Sequence<Double>.average(): Double {
//        var sum: Double = 0.0
//        var count: Int = 0
//        for (element in this) {
//            sum += element
//            count += 1
//        }
//        return if (count == 0) Double.NaN else sum / count
//    }
//
///**
// * Returns the sum of all elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("sumOfByte")
//    public fun Sequence<Byte>.sum(): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
///**
// * Returns the sum of all elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("sumOfShort")
//    public fun Sequence<Short>.sum(): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
///**
// * Returns the sum of all elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("sumOfInt")
//    public fun Sequence<Int>.sum(): Int {
//        var sum: Int = 0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
///**
// * Returns the sum of all elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("sumOfLong")
//    public fun Sequence<Long>.sum(): Long {
//        var sum: Long = 0L
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
///**
// * Returns the sum of all elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("sumOfFloat")
//    public fun Sequence<Float>.sum(): Float {
//        var sum: Float = 0.0f
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
//
///**
// * Returns the sum of all elements in the sequence.
// *
// * The operation is _terminal_.
// */
//    @kotlin.jvm.JvmName("sumOfDouble")
//    public fun Sequence<Double>.sum(): Double {
//        var sum: Double = 0.0
//        for (element in this) {
//            sum += element
//        }
//        return sum
//    }
}
