package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

@SuppressWarnings({"WeakerAccess"})
public class Collectionx {

    public static final List EMPTY_LIST = new ArrayList(0);

    /**
     * Returns an immutable list containing only the specified object [element].
     * The returned list is serializable.
     */
    public static <T> List<T> listOf(T element) {
        return java.util.Collections.singletonList(element);
    }

    /**
     * Returns a new read-only list of given elements.  The returned list is serializable (JVM).
     */
    public static <T> List<T> listOf(T... elements) {
        //noinspection unchecked
        return elements.length > 0 ? Arrayx.asList(elements) : (List<T>) emptyList();
    }

    /**
     * Returns an empty read-only list.  The returned list is serializable (JVM).
     */
    public static <T> List<T> emptyList() {
        //noinspection unchecked
        return EMPTY_LIST;
    }


    public static int collectionSizeOrDefault(@NotNull Iterable iterable, int defaultValue) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : defaultValue;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <T, C extends Collection<T>> C filterTo(@NotNull Iterable<T> iterable, @NotNull C destination,
                                                          @NotNull Predicate<T> predicate) {
        for (T element : iterable) {
            if (predicate.predicate(element)) {
                destination.add(element);
            }
        }
        return destination;
    }

    /**
     * Appends all elements not matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <T, C extends Collection<T>> C filterNotTo(@NotNull Iterable<T> iterable, @NotNull C destination,
                                                             @NotNull Predicate<T> predicate) {
        for (T element : iterable) {
            if (!predicate.predicate(element)) {
                destination.add(element);
            }
        }
        return destination;
    }

    /**
     * Appends all elements that are not `null` to the given [destination].
     */
    @NotNull
    public static <C extends Collection<T>, T> C filterNotNullTo(@NotNull Iterable<T> iterable, @NotNull C destination) {
        for (T element : iterable) {
            if (element != null) {
                destination.add(element);
            }
        }
        return destination;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <T, C extends Collection<T>> C filterIndexedTo(@NotNull Iterable<T> iterable, @NotNull C destination,
                                                                 @NotNull IndexedPredicate<T> predicate) {
        int index = 0;
        for (T element : iterable) {
            if (predicate.predicate(index++, element)) {
                destination.add(element);
            }
        }
        return destination;
    }

    /**
     * Appends all elements that are instances of specified class to the given [destination].
     */
    @NotNull
    public static <C extends Collection<R>, R> C filterIsInstanceTo(@NotNull Iterable<?> iterable, @NotNull C destination,
                                                                    @NotNull Class<R> clazz) {
        for (Object element : iterable) {
            if (clazz.isInstance(element)) {
                //noinspection unchecked
                destination.add((R) element);
            }
        }
        return destination;
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     */
    @NotNull
    public static <T> List<T> filter(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        return filterTo(iterable, new ArrayList<T>(), predicate);
    }

    /**
     * Returns a list containing all elements not matching the given [predicate].
     */
    @NotNull
    public static <T> List<T> filterNot(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        return filterNotTo(iterable, new ArrayList<T>(), predicate);
    }

    /**
     * Returns a list containing all elements that are not `null`.
     */
    @NotNull
    public static <T> List<T> filterNotNull(@NotNull Iterable<T> iterable) {
        return filterNotNullTo(iterable, new ArrayList<T>());
    }

    /**
     * Returns a list containing only elements matching the given [predicate].
     *
     * @param predicate function that takes the index of an element and the element itself
     *                  and returns the result of predicate evaluation on the element.
     */
    @NotNull
    public static <T> List<T> filterIndexed(@NotNull Iterable<T> iterable, @NotNull IndexedPredicate<T> predicate) {
        return filterIndexedTo(iterable, new ArrayList<T>(), predicate);
    }

    /**
     * Returns a list containing all elements that are instances of specified class.
     */
    @NotNull
    public static <R> List<R> filterIsInstance(@NotNull Iterable<?> iterable, @NotNull Class<R> clazz) {
        return filterIsInstanceTo(iterable, new ArrayList<R>(), clazz);
    }


    /**
     * Applies the given [transform] function to each element of the original collection
     * and appends the results to the given [destination].
     */
    @NotNull
    public static <Data, Result, D extends Collection<Result>> D mapTo(@NotNull Iterable<Data> iterable, @NotNull D destination,
                                                                       @NotNull Transformer<Data, Result> transform) {
        for (Data data : iterable) {
            destination.add(transform.transform(data));
        }
        return destination;
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element in the original collection.
     */
    @NotNull
    public static <Data, Result> List<Result> map(@NotNull Iterable<Data> iterable, @NotNull Transformer<Data, Result> transform) {
        return mapTo(iterable, new ArrayList<Result>(collectionSizeOrDefault(iterable, 10)), transform);
    }


    /**
     * Applies the given [transform] function to each element and its index in the original collection
     * and appends the results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    @NotNull
    public static <Data, Result, D extends Collection<Result>> D mapIndexedTo(@NotNull Iterable<Data> iterable, @NotNull D destination,
                                                                              @NotNull IndexedTransformer<Data, Result> transform) {
        int index = 0;
        for (Data data : iterable) {
            destination.add(transform.transform(index, data));
        }
        return destination;
    }

    /**
     * Returns a list containing the results of applying the given [transform] function
     * to each element and its index in the original collection.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    @NotNull
    public static <Data, Result> List<Result> mapIndexed(@NotNull Iterable<Data> iterable, @NotNull IndexedTransformer<Data, Result> transform) {
        return mapIndexedTo(iterable, new ArrayList<Result>(collectionSizeOrDefault(iterable, 10)), transform);
    }


    /**
     * Applies the given [transform] function to each element in the original collection
     * and appends only the non-null results to the given [destination].
     */
    @NotNull
    public static <Data, Result, D extends Collection<Result>> D mapNotNullTo(@NotNull Iterable<Data> iterable, @NotNull D destination,
                                                                              @NotNull NullableTransformer<Data, Result> transform) {
        for (Data data : iterable) {
            Result result = transform.transform(data);
            if (result != null) {
                destination.add(result);
            }
        }
        return destination;
    }

    /**
     * Returns a list containing only the non-null results of applying the given [transform] function
     * to each element in the original collection.
     */
    @NotNull
    public static <Data, Result> List<Result> mapNotNull(@NotNull Iterable<Data> iterable, @NotNull NullableTransformer<Data, Result> transform) {
        return mapNotNullTo(iterable, new ArrayList<Result>(collectionSizeOrDefault(iterable, 10)), transform);
    }


    /**
     * Applies the given [transform] function to each element and its index in the original collection
     * and appends only the non-null results to the given [destination].
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    @NotNull
    public static <Data, Result, D extends Collection<Result>> D mapIndexedNotNullTo(@NotNull Iterable<Data> iterable, @NotNull D destination,
                                                                                     @NotNull NullableIndexedTransformer<Data, Result> transform) {
        int index = 0;
        for (Data data : iterable) {
            Result result = transform.transform(index, data);
            if (result != null) {
                destination.add(result);
            }
        }
        return destination;
    }

    /**
     * Returns a list containing only the non-null results of applying the given [transform] function
     * to each element and its index in the original collection.
     *
     * @param transform function that takes the index of an element and the element itself
     *                  and returns the result of the transform applied to the element.
     */
    @NotNull
    public static <Data, Result> List<Result> mapIndexedNotNull(@NotNull Iterable<Data> iterable,
                                                                @NotNull NullableIndexedTransformer<Data, Result> transform) {
        return mapIndexedNotNullTo(iterable, new ArrayList<Result>(collectionSizeOrDefault(iterable, 10)), transform);
    }


    /**
     * Appends all elements yielded from results of [transform] function being invoked on each element of original collection, to the given [destination].
     */
    public static <T, R, C extends Collection<R>> C flatMapTo(Iterable<T> iterable, C destination, Transformer<T, Iterable<R>> transform) {
        for (T element : iterable) {
            Iterable<R> list = transform.transform(element);
            addAll(destination, list);
        }
        return destination;
    }

    /**
     * Returns a single list of all elements yielded from results of [transform] function being invoked on each element of original collection.
     */
    public static <T, R> List<R> flatMap(Iterable<T> iterable, Transformer<T, Iterable<R>> transform) {
        return flatMapTo(iterable, new ArrayList<R>(), transform);
    }


    /**
     * Appends the string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <T, A extends Appendable> A joinTo(@NotNull Iterable<T> iterable, @NotNull A buffer, @Nullable CharSequence separator,
                                                     @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                                     @Nullable CharSequence truncated, @Nullable Transformer<T, CharSequence> transform) {
        if (separator == null) separator = ", ";
        if (prefix == null) prefix = "";
        if (postfix == null) postfix = "";
        if (truncated == null) truncated = "...";

        StringBuilderx.appendElement(buffer, prefix, null);
        int count = 0;
        for (T element : iterable) {
            if (++count > 1) {
                StringBuilderx.appendElement(buffer, separator, null);
            }
            if (limit < 0 || count <= limit) {
                StringBuilderx.appendElement(buffer, element, transform);
            } else {
                break;
            }
        }
        if (limit >= 0 && count > limit) {
            StringBuilderx.appendElement(buffer, truncated, null);
        }
        StringBuilderx.appendElement(buffer, postfix, null);
        return buffer;
    }

    /**
     * Creates a string from all the elements separated using [separator] and using the given [prefix] and [postfix] if supplied.
     * <p>
     * If the collection could be huge, you can specify a non-negative value of [limit], in which case only the first [limit]
     * elements will be appended, followed by the [truncated] string (which defaults to "...").
     */
    @NotNull
    public static <T> String joinToString(@NotNull Iterable<T> iterable, @Nullable CharSequence separator,
                                          @Nullable CharSequence prefix, @Nullable CharSequence postfix, int limit,
                                          @Nullable CharSequence truncated, @Nullable Transformer<T, CharSequence> transform) {
        return joinTo(iterable, new StringBuilder(), separator, prefix, postfix, limit, truncated, transform).toString();
    }

    @NotNull
    public static <T> String joinToArrayString(@NotNull Iterable<T> iterable, @Nullable Transformer<T, CharSequence> transform) {
        return joinTo(iterable, new StringBuilder(), ", ", "[", "]", -1, null, transform).toString();
    }


    /**
     * Returns the number of elements in this collection.
     */
    public static <T> int count(@NotNull Iterable<T> iterable) {
        if (iterable instanceof Collection) {
            return ((java.util.Collection) iterable).size();
        }
        int count = 0;
        for (T ignored : iterable) {
            count++;
        }
        return count;
    }

    /**
     * Returns the number of elements matching the given [predicate].
     */
    public static <T> int count(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        if (iterable instanceof Collection && ((java.util.Collection) iterable).isEmpty()) {
            return 0;
        }
        int count = 0;
        for (T element : iterable) {
            if (predicate.predicate(element)) {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns the number of elements in this collection.
     */
    public static <T> int count(@NotNull Collection<T> collection) {
        return collection.size();
    }


    /**
     * Returns an average value of elements in the collection.
     */
    public static double averageOfByte(@NotNull Iterable<Byte> iterable) {
        double sum = 0.0;
        int count = 0;
        for (byte element : iterable) {
            sum += element;
            count += 1;
        }
        return count == 0 ? Double.NaN : sum / count;
    }

    /**
     * Returns an average value of elements in the collection.
     */
    public static double averageOfShort(@NotNull Iterable<Short> iterable) {
        double sum = 0.0;
        int count = 0;
        for (short element : iterable) {
            sum += element;
            count += 1;
        }
        return count == 0 ? Double.NaN : sum / count;
    }

    /**
     * Returns an average value of elements in the collection.
     */
    public static double averageOfInt(@NotNull Iterable<Integer> iterable) {
        double sum = 0.0;
        int count = 0;
        for (int element : iterable) {
            sum += element;
            count += 1;
        }
        return count == 0 ? Double.NaN : sum / count;
    }

    /**
     * Returns an average value of elements in the collection.
     */
    public static double averageOfLong(@NotNull Iterable<Long> iterable) {
        double sum = 0.0;
        int count = 0;
        for (long element : iterable) {
            sum += element;
            count += 1;
        }
        return count == 0 ? Double.NaN : sum / count;
    }

    /**
     * Returns an average value of elements in the collection.
     */
    public static double averageOfFloat(@NotNull Iterable<Float> iterable) {
        double sum = 0.0;
        int count = 0;
        for (float element : iterable) {
            sum += element;
            count += 1;
        }
        return count == 0 ? Double.NaN : sum / count;
    }

    /**
     * Returns an average value of elements in the collection.
     */
    public static double averageOfDouble(@NotNull Iterable<Double> iterable) {
        double sum = 0.0;
        int count = 0;
        for (double element : iterable) {
            sum += element;
            count += 1;
        }
        return count == 0 ? Double.NaN : sum / count;
    }


    /**
     * Returns the sum of all elements in the collection.
     */
    public static int sumOfByte(@NotNull Iterable<Byte> iterable) {
        int sum = 0;
        for (byte element : iterable) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the collection.
     */
    public static int sumOfShort(@NotNull Iterable<Short> iterable) {
        int sum = 0;
        for (short element : iterable) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the collection.
     */
    public static int sumOfInt(@NotNull Iterable<Integer> iterable) {
        int sum = 0;
        for (int element : iterable) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the collection.
     */
    public static long sumOfLong(@NotNull Iterable<Long> iterable) {
        long sum = 0L;
        for (long element : iterable) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the collection.
     */
    public static float sumOfFloat(@NotNull Iterable<Float> iterable) {
        float sum = 0.0f;
        for (float element : iterable) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all elements in the collection.
     */
    public static double sumOfDouble(@NotNull Iterable<Double> iterable) {
        double sum = 0.0;
        for (double element : iterable) {
            sum += element;
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the collection.
     */
    public static <T> int sumBy(@NotNull Iterable<T> iterable, @NotNull Transformer<T, Integer> selector) {
        int sum = 0;
        for (T element : iterable) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the collection.
     */
    public static <T> double sumByDouble(@NotNull Iterable<T> iterable, @NotNull Transformer<T, Double> selector) {
        double sum = 0.0;
        for (T element : iterable) {
            sum += selector.transform(element);
        }
        return sum;
    }


    /**
     * Returns first element.
     *
     * @throws NoSuchElementException if the list is empty.
     */
    @NotNull
    public static <T> T first(@NotNull List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        } else {
            return list.get(0);
        }
    }

    /**
     * Returns first element.
     *
     * @throws NoSuchElementException if the collection is empty.
     */
    @NotNull
    public static <T> T first(@NotNull Iterable<T> iterable) {
        if (iterable instanceof List) {
            return first((List<T>) iterable);
        } else {
            Iterator<T> iterator = iterable.iterator();
            if (!iterator.hasNext()) {
                throw new NoSuchElementException("Collection is empty.");
            } else {
                return iterator.next();
            }
        }
    }

    /**
     * Returns the first element matching the given [predicate].
     *
     * @throws NoSuchElementException if no such element is found.
     */
    @NotNull
    public static <T> T first(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        for (T element : iterable) {
            if (predicate.predicate(element)) {
                return element;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /**
     * Returns the first element, or `null` if the list is empty.
     */
    @Nullable
    public static <T> T firstOrNull(@NotNull List<T> list) {
        return list.isEmpty() ? null : list.get(0);
    }

    /**
     * Returns the first element, or `null` if the collection is empty.
     */
    @Nullable
    public static <T> T firstOrNull(@NotNull Iterable<T> iterable) {
        if (iterable instanceof List) {
            return firstOrNull((List<T>) iterable);
        } else {
            Iterator<T> iterator = iterable.iterator();
            return !iterator.hasNext() ? null : iterator.next();
        }
    }

    /**
     * Returns the first element matching the given [predicate], or `null` if element was not found.
     */
    @Nullable
    public static <T> T firstOrNull(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        for (T element : iterable) {
            if (predicate.predicate(element)) {
                return element;
            }
        }
        return null;
    }


    /**
     * Returns the last element.
     *
     * @throws NoSuchElementException if the list is empty.
     */
    @NotNull
    public static <T> T last(@NotNull List<T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        } else {
            return list.get(list.size() - 1);
        }
    }

    /**
     * Returns the last element matching the given [predicate].
     *
     * @throws NoSuchElementException if no such element is found.
     */
    @NotNull
    public static <T> T last(@NotNull List<T> list, @NotNull Predicate<T> predicate) {
        ListIterator<T> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            T element = iterator.previous();
            if (predicate.predicate(element)) return element;
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    /**
     * Returns last index of [element], or -1 if the collection does not contain element.
     */
    public static <T> int lastIndexOf(Iterable<T> iterable, T element) {
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(element);
        } else {
            int lastIndex = -1;
            int index = 0;
            for (T item : iterable) {
                if (element.equals(item)) {
                    lastIndex = index;
                }
                index++;
            }
            return lastIndex;
        }
    }

    /**
     * Returns last index of [element], or -1 if the list does not contain element.
     */
    public static <T> int lastIndexOf(List<T> list, T element) {
        return list.lastIndexOf(element);
    }

    /**
     * Returns the last element.
     *
     * @throws NoSuchElementException if the collection is empty.
     */
    @NotNull
    public static <T> T last(@NotNull Iterable<T> iterable) {
        if (iterable instanceof List) {
            return last((List<T>) iterable);
        } else {
            Iterator<T> iterator = iterable.iterator();
            if (!iterator.hasNext()) {
                throw new NoSuchElementException("Collection is empty.");
            } else {
                T last = iterator.next();
                while (iterator.hasNext()) {
                    last = iterator.next();
                }
                return last;
            }
        }
    }

    /**
     * Returns the last element matching the given [predicate].
     *
     * @throws NoSuchElementException if no such element is found.
     */
    @NotNull
    public static <T> T last(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        T last = null;
        boolean found = false;
        for (T element : iterable) {
            if (predicate.predicate(element)) {
                last = element;
                found = true;
            }
        }
        if (!found) {
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        } else {
            return last;
        }
    }

    /**
     * Returns the last element, or `null` if the list is empty.
     */
    @Nullable
    public static <T> T lastOrNull(@NotNull List<T> list) {
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    /**
     * Returns the last element matching the given [predicate], or `null` if no such element was found.
     */
    @Nullable
    public static <T> T lastOrNull(@NotNull List<T> list, @NotNull Predicate<T> predicate) {
        ListIterator<T> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            T element = iterator.previous();
            if (predicate.predicate(element)) return element;
        }
        return null;
    }

    /**
     * Returns the last element, or `null` if the collection is empty.
     */
    @Nullable
    public static <T> T lastOrNull(@NotNull Iterable<T> iterable) {
        if (iterable instanceof List) {
            List<T> list = (List<T>) iterable;
            return list.isEmpty() ? null : list.get(list.size() - 1);
        } else {
            Iterator<T> iterator = iterable.iterator();
            if (!iterator.hasNext()) {
                return null;
            }
            T last = iterator.next();
            while (iterator.hasNext()) {
                last = iterator.next();
            }
            return last;
        }
    }

    /**
     * Returns the last element matching the given [predicate], or `null` if no such element was found.
     */
    @Nullable
    public static <T> T lastOrNull(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        T last = null;
        for (T element : iterable) {
            if (predicate.predicate(element)) {
                last = element;
            }
        }
        return last;
    }


    /**
     * Returns the first element matching the given [predicate], or `null` if no such element was found.
     */
    @Nullable
    public static <T> T find(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        return firstOrNull(iterable, predicate);
    }

    /**
     * Returns the last element matching the given [predicate], or `null` if no such element was found.
     */
    @Nullable
    public static <T> T findLast(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        return lastOrNull(iterable, predicate);
    }

    /**
     * Returns the last element matching the given [predicate], or `null` if no such element was found.
     */
    @Nullable
    public static <T> T findLast(@NotNull List<T> list, @NotNull Predicate<T> predicate) {
        return lastOrNull(list, predicate);
    }


    /**
     * Returns an element at the given [index] or the result of calling the [defaultValue] function if the [index] is out of bounds of this list.
     */
    @NotNull
    public static <T> T getOrElse(@NotNull List<T> list, int index, @NotNull Transformer<Integer, T> defaultValue) {
        return index >= 0 && index <= list.size() - 1 ? list.get(index) : defaultValue.transform(index);
    }

    /**
     * Returns an element at the given [index] or `null` if the [index] is out of bounds of this list.
     */
    @Nullable
    public static <T> T getOrNull(@NotNull List<T> list, int index) {
        return index >= 0 && index <= list.size() - 1 ? list.get(index) : null;
    }


    /**
     * Returns the largest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    @Nullable
    public static Double maxOfDouble(@NotNull Iterable<Double> iterable) {
        Iterator<Double> iterator = iterable.iterator();
        if (!iterator.hasNext()) return null;
        double max = iterator.next();
        if (Double.isNaN(max)) return max;
        while (iterator.hasNext()) {
            double e = iterator.next();
            if (Double.isNaN(e)) return e;
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the largest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    @Nullable
    public static Float maxOfFloat(@NotNull Iterable<Float> iterable) {
        Iterator<Float> iterator = iterable.iterator();
        if (!iterator.hasNext()) return null;
        float max = iterator.next();
        if (Float.isNaN(max)) return max;
        while (iterator.hasNext()) {
            float e = iterator.next();
            if (Float.isNaN(e)) return e;
            if (max < e) max = e;
        }
        return max;
    }

    /**
     * Returns the largest element or `null` if there are no elements.
     */
    @Nullable
    public static <T extends Comparable<T>> T max(@NotNull Iterable<T> iterable) {
        Iterator<T> iterator = iterable.iterator();
        if (!iterator.hasNext()) return null;
        T max = iterator.next();
        while (iterator.hasNext()) {
            T e = iterator.next();
            if (max.compareTo(e) < 0) max = e;
        }
        return max;
    }

    /**
     * Returns the first element yielding the largest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <T, R extends Comparable<R>> T maxBy(@NotNull Iterable<T> iterable, @NotNull Transformer<T, R> selector) {
        Iterator<T> iterator = iterable.iterator();
        if (!iterator.hasNext()) return null;
        T maxElem = iterator.next();
        R maxValue = selector.transform(maxElem);
        while (iterator.hasNext()) {
            T e = iterator.next();
            R v = selector.transform(e);
            if (maxValue.compareTo(v) < 0) {
                maxElem = e;
                maxValue = v;
            }
        }
        return maxElem;
    }

    /**
     * Returns the first element having the largest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static <T> T maxWith(@NotNull Iterable<T> iterable, @NotNull Comparator<T> comparator) {
        Iterator<T> iterator = iterable.iterator();
        if (!iterator.hasNext()) return null;
        T max = iterator.next();
        while (iterator.hasNext()) {
            T e = iterator.next();
            if (comparator.compare(max, e) < 0) max = e;
        }
        return max;
    }


    /**
     * Returns the smallest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    public static Double minOfDouble(@NotNull Iterable<Double> iterable) {
        Iterator<Double> iterator = iterable.iterator();
        if (!iterator.hasNext()) return null;
        double min = iterator.next();
        if (Double.isNaN(min)) return min;
        while (iterator.hasNext()) {
            double e = iterator.next();
            if (Double.isNaN(e)) return e;
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the smallest element or `null` if there are no elements.
     * <p>
     * If any of elements is `NaN` returns `NaN`.
     */
    @Nullable
    public static Float minOfFloat(@NotNull Iterable<Float> iterable) {
        Iterator<Float> iterator = iterable.iterator();
        if (!iterator.hasNext()) return null;
        float min = iterator.next();
        if (Float.isNaN(min)) return min;
        while (iterator.hasNext()) {
            float e = iterator.next();
            if (Float.isNaN(e)) return e;
            if (min > e) min = e;
        }
        return min;
    }

    /**
     * Returns the smallest element or `null` if there are no elements.
     */
    @Nullable
    public static <T extends Comparable<T>> T min(@NotNull Iterable<T> iterable) {
        Iterator<T> iterator = iterable.iterator();
        if (!iterator.hasNext()) return null;
        T min = iterator.next();
        while (iterator.hasNext()) {
            T e = iterator.next();
            if (min.compareTo(e) > 0) min = e;
        }
        return min;
    }

    /**
     * Returns the first element yielding the smallest value of the given function or `null` if there are no elements.
     */
    @Nullable
    public static <T, R extends Comparable<R>> T minBy(@NotNull Iterable<T> iterable, @NotNull Transformer<T, R> selector) {
        Iterator<T> iterator = iterable.iterator();
        if (!iterator.hasNext()) return null;
        T minElem = iterator.next();
        R minValue = selector.transform(minElem);
        while (iterator.hasNext()) {
            T e = iterator.next();
            R v = selector.transform(e);
            if (minValue.compareTo(v) > 0) {
                minElem = e;
                minValue = v;
            }
        }
        return minElem;
    }

    /**
     * Returns the first element having the smallest value according to the provided [comparator] or `null` if there are no elements.
     */
    @Nullable
    public static <T> T minWith(@NotNull Iterable<T> iterable, @NotNull Comparator<T> comparator) {
        Iterator<T> iterator = iterable.iterator();
        if (!iterator.hasNext()) return null;
        T min = iterator.next();
        while (iterator.hasNext()) {
            T e = iterator.next();
            if (comparator.compare(min, e) > 0) min = e;
        }
        return min;
    }


    /**
     * Adds all elements of the given [elements] collection to this [MutableCollection].
     */
    @SuppressWarnings("UnusedReturnValue")
    public static <T> boolean addAll(@NotNull Collection<T> collection, @NotNull Iterable<T> elements) {
        if (elements instanceof Collection) {
            return collection.addAll((Collection<? extends T>) elements);
        } else {
            boolean result = false;
            for (T item : elements)
                if (collection.add(item)) {
                    result = true;
                }
            return result;
        }
    }


    /**
     * Adds all elements of the given [elements] collection to this [MutableCollection].
     */
    @SuppressWarnings("UnusedReturnValue")
    public static <T> boolean addAll(@NotNull Collection<T> collection, @NotNull T[] elements) {
        boolean result = false;
        for (T item : elements)
            if (collection.add(item)) {
                result = true;
            }
        return result;
    }

    /**
     * Splits the original collection into pair of lists,
     * where *first* list contains elements for which [predicate] yielded `true`,
     * while *second* list contains elements for which [predicate] yielded `false`.
     */
    @NotNull
    public static <T> Pair<List<T>, List<T>> partition(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        List<T> first = new ArrayList<T>();
        List<T> second = new ArrayList<T>();
        for (T element : iterable) {
            if (predicate.predicate(element)) {
                first.add(element);
            } else {
                second.add(element);
            }
        }
        return Pair.of(first, second);
    }


    /**
     * Appends all elements to the given [destination] collection.
     */
    @NotNull
    public static <T, C extends Collection<T>> C toCollection(@NotNull Iterable<T> iterable, @NotNull C destination) {
        for (T item : iterable) {
            destination.add(item);
        }
        return destination;
    }

    /**
     * Returns a [List] all elements.
     */
    @NotNull
    public static <T> List<T> toList(@NotNull Iterable<T> iterable) {
        if (iterable instanceof Collection) {
            return toCollection(iterable, new ArrayList<T>(((Collection) iterable).size()));
        } else {
            return toCollection(iterable, new ArrayList<T>());
        }
    }

    /**
     * Returns a [Set] all elements.
     * <p>
     * The returned set preserves the element iteration order of the original collection.
     */
    @NotNull
    public static <T> Set<T> toSet(@NotNull Iterable<T> iterable) {
        if (iterable instanceof Collection) {
            return toCollection(iterable, new LinkedHashSet<T>(Mapx.mapCapacity(collectionSizeOrDefault(iterable, ((Collection) iterable).size()))));
        } else {
            return toCollection(iterable, new LinkedHashSet<T>());
        }
    }

    /**
     * Returns a [SortedSet] of all elements.
     */
    @NotNull
    public static <T extends Comparable<T>> SortedSet<T> toSortedSet(@NotNull Iterable<T> iterable) {
        return toCollection(iterable, new TreeSet<T>());
    }

    /**
     * Returns a [SortedSet] of all elements.
     * Elements in the set returned are sorted according to the given [comparator].
     */
    @NotNull
    public static <T> SortedSet<T> toSortedSet(@NotNull Iterable<T> iterable, @NotNull Comparator<T> comparator) {
        return toCollection(iterable, new TreeSet<T>(comparator));
    }

    /**
     * Returns a [Set] all elements.
     * <p>
     * The returned set preserves the element iteration order of the original collection.
     */
    @NotNull
    public static <T> HashSet<T> toHashSet(@NotNull Iterable<T> iterable) {
        return toCollection(iterable, new HashSet<T>(Mapx.mapCapacity(collectionSizeOrDefault(iterable, 12))));
    }

    /**
     * Returns true when it's safe to convert this collection to a set without changing contains method behavior.
     */
    public static <T> boolean safeToConvertToSet(@NotNull Collection<T> collection) {
        return collection.size() > 2 && collection instanceof ArrayList;
    }

    /**
     * Converts this collection to a set, when it's worth so and it doesn't change contains method behavior.
     */
    @NotNull
    public static <T> Collection<T> convertToSetForSetOperationWith(@NotNull Iterable<T> iterable, @NotNull Iterable<T> source) {
        if (iterable instanceof Set) {
            return (Set<T>) iterable;
        } else if (iterable instanceof Collection) {
            if (source instanceof Collection && ((Collection) source).size() < 2) {
                return (Collection<T>) iterable;
            } else if (safeToConvertToSet((Collection<T>) iterable)) {
                return toHashSet(iterable);
            } else {
                return (Collection<T>) iterable;
            }
        } else {
            return toHashSet(iterable);
        }
    }

    /**
     * Converts this collection to a set, when it's worth so and it doesn't change contains method behavior.
     */
    @NotNull
    public static <T> Collection<T> convertToSetForSetOperation(@NotNull Iterable<T> iterable) {
        if (iterable instanceof Set) {
            return (Set<T>) iterable;
        } else if (iterable instanceof Collection) {
            if (safeToConvertToSet((Collection<T>) iterable)) {
                return toHashSet(iterable);
            } else {
                return (Collection<T>) iterable;
            }
        } else {
            return toHashSet(iterable);
        }
    }


    /**
     * Returns a set containing all distinct elements from both collections.
     * <p>
     * The returned set preserves the element iteration order of the original collection.
     * Those elements of the [other] collection that are unique are iterated in the end
     * in the order of the [other] collection.
     */
    @NotNull
    public static <T> Set<T> union(@NotNull Iterable<T> self, @NotNull Iterable<T> other) {
        LinkedHashSet<T> set = toCollection(self, new LinkedHashSet<T>());
        addAll(set, other);
        return set;
    }

    /**
     * Returns `true` if all elements match the given [predicate].
     */
    public static <T> boolean all(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        if (iterable instanceof Collection && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (T element : iterable) {
            if (!predicate.predicate(element)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Returns `true` if collection has at least one element.
     */
    public static <T> boolean any(@NotNull Iterable<T> iterable) {
        if (iterable instanceof Collection) {
            return !((Collection) iterable).isEmpty();
        } else {
            return iterable.iterator().hasNext();
        }
    }

    /**
     * Returns `true` if at least one element matches the given [predicate].
     */
    public static <T> boolean any(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        if (iterable instanceof Collection && ((Collection) iterable).isEmpty()) {
            return false;
        } else {
            for (T element : iterable) {
                if (predicate.predicate(element)) {
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * Returns `true` if the collection has no elements.
     */
    public static <T> boolean none(@NotNull Iterable<T> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        } else {
            return !iterable.iterator().hasNext();
        }
    }

    /**
     * Returns `true` if no elements match the given [predicate].
     */
    public static <T> boolean none(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        if (iterable instanceof Collection && ((Collection) iterable).isEmpty()) {
            return true;
        } else {
            for (T element : iterable) {
                if (predicate.predicate(element)) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Returns `true` if [element] is found in the collection.
     */
    public static <T> boolean contains(@NotNull Iterable<T> iterable, @NotNull T element) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(element);
        } else {
            return indexOf(iterable, element) >= 0;
        }
    }


    /**
     * Performs the given [action] on each element.
     */
    public static <T> void forEach(@NotNull Iterable<T> iterable, @NotNull Action<T> action) {
        for (T element : iterable) action.action(element);
    }

    /**
     * Performs the given [action] on each element, providing sequential index with the element.
     *
     * @param action function that takes the index of an element and the element itself
     *               and performs the desired action on the element.
     */
    public static <T> void forEachIndexed(@NotNull Iterable<T> iterable, @NotNull IndexedAction<T> action) {
        int index = 0;
        for (T item : iterable) {
            action.action(index++, item);
        }
    }


    /**
     * Splits this collection into a list of lists each not exceeding the given [size].
     * <p>
     * The last list in the resulting list may have less elements than the given [size].
     *
     * @param size the number of elements to take in each list, must be positive and can be greater than the number of elements in this collection.
     */
    @NotNull
    public static <T> List<List<T>> chunked(@NotNull Iterable<T> iterable, int size) {
        if (size <= 0) throw new IllegalArgumentException("size is 0");

        int listSize = count(iterable);
        int resultSize = (listSize / size) + (listSize % size == 0 ? 0 : 1);
        List<List<T>> resultList = new ArrayList<List<T>>(resultSize);
        List<T> chunkedList = null;
        int index = 0;
        for (T element : iterable) {
            if (chunkedList == null) {
                chunkedList = new ArrayList<T>(Math.min(size, listSize - index));
            }
            chunkedList.add(element);
            if (chunkedList.size() >= size) {
                resultList.add(chunkedList);
                chunkedList = null;
            }
            index++;
        }
        return resultList;
    }

    /**
     * Splits this collection into several lists each not exceeding the given [size]
     * and applies the given [transform] function to an each.
     *
     * @param size the number of elements to take in each list, must be positive and can be greater than the number of elements in this collection.
     * @return list of results of the [transform] applied to an each list.
     * <p>
     * Note that the list passed to the [transform] function is ephemeral and is valid only inside that function.
     * You should not store it or allow it to escape in some way, unless you made a snapshot of it.
     * The last list may have less elements than the given [size].
     */
    @NotNull
    public static <T, R> List<R> chunked(@NotNull Iterable<T> iterable, int size, @NotNull Transformer<List<T>, R> transform) {
        if (size <= 0) throw new IllegalArgumentException("size is 0");

        int listSize = count(iterable);
        int resultSize = (listSize / size) + (listSize % size == 0 ? 0 : 1);
        List<R> resultList = new ArrayList<R>(resultSize);
        List<T> chunkedList = null;
        int index = 0;
        for (T element : iterable) {
            if (chunkedList == null) {
                chunkedList = new ArrayList<T>(Math.min(size, listSize - index));
            }
            chunkedList.add(element);
            if (chunkedList.size() >= size) {
                resultList.add(transform.transform(chunkedList));
                chunkedList = null;
            }
            index++;
        }
        return resultList;
    }


    /**
     * Returns a list containing all elements of the original collection without the first occurrence of the given [element].
     */
    @NotNull
    public static <T> List<T> minus(@NotNull Iterable<T> iterable, @NotNull final T element) {
        ArrayList<T> result = new ArrayList<T>(collectionSizeOrDefault(iterable, 10));
        final boolean[] removed = new boolean[]{false};
        return filterTo(iterable, result, new Predicate<T>() {
            @Override
            public boolean predicate(@NotNull T t) {
                if (!removed[0] && t.equals(element)) {
                    removed[0] = true;
                    return false;
                } else {
                    return true;
                }
            }
        });
    }

    /**
     * Returns a list containing all elements of the original collection except the elements contained in the given [elements] array.
     */
    @NotNull
    public static <T> List<T> minus(@NotNull Iterable<T> iterable, @NotNull T[] elements) {
        if (Arrayx.isEmpty(elements)) return toList(iterable);
        final HashSet<T> other = Arrayx.toHashSet(elements);
        return filterNot(iterable, new Predicate<T>() {
            @Override
            public boolean predicate(@NotNull T t) {
                return other.contains(t);
            }
        });
    }

    /**
     * Returns a list containing all elements of the original collection except the elements contained in the given [elements] collection.
     */
    @NotNull
    public static <T> List<T> minus(@NotNull Iterable<T> iterable, @NotNull Iterable<T> elements) {
        final Collection<T> other = convertToSetForSetOperationWith(elements, iterable);
        if (other.isEmpty()) return toList(iterable);
        return filterNot(iterable, new Predicate<T>() {
            @Override
            public boolean predicate(@NotNull T t) {
                return other.contains(t);
            }
        });
    }

    /**
     * Returns a list containing all elements of the original collection without the first occurrence of the given [element].
     */
    @NotNull
    public static <T> List<T> minusElement(@NotNull Iterable<T> iterable, @NotNull T element) {
        return minus(iterable, element);
    }


    /**
     * Returns a list containing all elements of the original collection and then the given [element].
     */
    @NotNull
    public static <T> List<T> plus(@NotNull Collection<T> collection, @NotNull T element) {
        ArrayList<T> result = new ArrayList<T>(collection.size() + 1);
        result.addAll(collection);
        result.add(element);
        return result;
    }

    /**
     * Returns a list containing all elements of the original collection and then the given [element].
     */
    @NotNull
    public static <T> List<T> plus(@NotNull Iterable<T> iterable, @NotNull T element) {
        if (iterable instanceof Collection) {
            return plus(((Collection<T>) iterable), element);
        } else {
            ArrayList<T> result = new ArrayList<T>();
            addAll(result, iterable);
            result.add(element);
            return result;
        }
    }

    /**
     * Returns a list containing all elements of the original collection and then all elements of the given [elements] array.
     */
    @NotNull
    public static <T> List<T> plus(@NotNull Collection<T> collection, @NotNull T[] elements) {
        ArrayList<T> result = new ArrayList<T>(collection.size() + elements.length);
        result.addAll(collection);
        addAll(result, elements);
        return result;
    }

    /**
     * Returns a list containing all elements of the original collection and then all elements of the given [elements] array.
     */
    @NotNull
    public static <T> List<T> plus(@NotNull Iterable<T> iterable, @NotNull T[] elements) {
        if (iterable instanceof Collection) {
            return plus(((Collection<T>) iterable), elements);
        } else {
            ArrayList<T> result = new ArrayList<T>();
            addAll(result, iterable);
            addAll(result, elements);
            return result;
        }
    }

    /**
     * Returns a list containing all elements of the original collection and then all elements of the given [elements] collection.
     */
    @NotNull
    public static <T> List<T> plus(@NotNull Collection<T> collection, @NotNull Iterable<T> elements) {
        if (elements instanceof Collection) {
            ArrayList<T> result = new ArrayList<T>(collection.size() + ((Collection) elements).size());
            addAll(result, collection);
            addAll(result, elements);
            return result;
        } else {
            ArrayList<T> result = new ArrayList<T>(collection);
            addAll(result, elements);
            return result;
        }
    }

    /**
     * Returns a list containing all elements of the original collection and then all elements of the given [elements] collection.
     */
    @NotNull
    public static <T> List<T> plus(@NotNull Iterable<T> iterable, @NotNull Iterable<T> elements) {
        if (iterable instanceof Collection) {
            return plus((Collection<T>) iterable, elements);
        } else {
            ArrayList<T> result = new ArrayList<T>();
            addAll(result, iterable);
            addAll(result, elements);
            return result;
        }
    }

    /**
     * Returns a list containing all elements of the original collection and then the given [element].
     */
    @NotNull
    public static <T> List<T> plusElement(@NotNull Collection<T> collection, @NotNull T element) {
        return plus(collection, element);
    }

    /**
     * Returns a list containing all elements of the original collection and then the given [element].
     */
    @NotNull
    public static <T> List<T> plusElement(@NotNull Iterable<T> iterable, @NotNull T element) {
        return plus(iterable, element);
    }


    /**
     * Groups elements of the original collection by the key returned by the given [keySelector] function
     * applied to each element and puts to the [destination] map each group key associated with a list of corresponding elements.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <T, K, M extends Map<K, List<T>>> M groupByTo(@NotNull Iterable<T> iterable, @NotNull M destination, @NotNull Transformer<T, K> keySelector) {
        DefaultValue<List<T>> defaultValue = new DefaultValue<List<T>>() {
            @NotNull
            @Override
            public List<T> get() {
                return new ArrayList<T>();
            }
        };
        for (T element : iterable) {
            K key = keySelector.transform(element);
            List<T> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(element);
        }
        return destination;
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original collection
     * by the key returned by the given [keySelector] function applied to the element
     * and puts to the [destination] map each group key associated with a list of corresponding values.
     *
     * @return The [destination] map.
     */
    @NotNull
    public static <T, K, V, M extends Map<K, List<V>>> M groupByTo(@NotNull Iterable<T> iterable, @NotNull M destination, @NotNull Transformer<T, K> keySelector, @NotNull Transformer<T, V> valueTransform) {
        DefaultValue<List<V>> defaultValue = new DefaultValue<List<V>>() {
            @NotNull
            @Override
            public List<V> get() {
                return new ArrayList<V>();
            }
        };
        for (T element : iterable) {
            K key = keySelector.transform(element);
            List<V> list = Mapx.getOrPut(destination, key, defaultValue);
            list.add(valueTransform.transform(element));
        }
        return destination;
    }

    /**
     * Groups elements of the original collection by the key returned by the given [keySelector] function
     * applied to each element and returns a map where each group key is associated with a list of corresponding elements.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original collection.
     */
    @NotNull
    public static <T, K> Map<K, List<T>> groupBy(@NotNull Iterable<T> iterable, @NotNull Transformer<T, K> keySelector) {
        return groupByTo(iterable, new LinkedHashMap<K, List<T>>(), keySelector);
    }

    /**
     * Groups values returned by the [valueTransform] function applied to each element of the original collection
     * by the key returned by the given [keySelector] function applied to the element
     * and returns a map where each group key is associated with a list of corresponding values.
     * <p>
     * The returned map preserves the entry iteration order of the keys produced from the original collection.
     */
    @NotNull
    public static <T, K, V> Map<K, List<V>> groupBy(@NotNull Iterable<T> iterable, @NotNull Transformer<T, K> keySelector, @NotNull Transformer<T, V> valueTransform) {
        return groupByTo(iterable, new LinkedHashMap<K, List<V>>(), keySelector, valueTransform);
    }

    /**
     * Creates a [Grouping] source from a collection to be used later with one of group-and-fold operations
     * using the specified [keySelector] function to extract a key from each element.
     */
    @NotNull
    public static <T, K> Grouping<T, K> groupingBy(@NotNull final Iterable<T> iterable, @NotNull final Transformer<T, K> keySelector) {
        return new Grouping<T, K>() {
            @Override
            public Iterator<T> sourceIterator() {
                return iterable.iterator();
            }

            @Override
            public K keyOf(T element) {
                return keySelector.transform(element);
            }
        };
    }


    /**
     * Sorts elements in the list in-place according to their natural sort order.
     */
    public static <T extends Comparable<T>> void sort(@NotNull List<T> list) {
        if (list.size() > 1) {
            java.util.Collections.sort(list);
        }
    }

    /**
     * Sorts elements in the list in-place according to the order specified with [comparator].
     */
    public static <T> void sortWith(@NotNull List<T> list, @NotNull Comparator<T> comparator) {
        if (list.size() > 1) {
            java.util.Collections.sort(list, comparator);
        }
    }

    /**
     * Sorts elements in the list in-place according to natural sort order of the value returned by specified [selector] function.
     */
    public static <T, R extends Comparable<R>> void sortBy(@NotNull List<T> list, @NotNull NullableTransformer<T, R> selector) {
        if (list.size() > 1) {
            //noinspection unchecked
            sortWith(list, Comparisonx.compareBy((NullableTransformer<T, Comparable>) selector));
        }
    }

    /**
     * Sorts elements in the list in-place descending according to natural sort order of the value returned by specified [selector] function.
     */
    public static <T, R extends Comparable<R>> void sortByDescending(@NotNull List<T> list, @NotNull NullableTransformer<T, R> selector) {
        if (list.size() > 1) {
            //noinspection unchecked
            sortWith(list, Comparisonx.compareByDescending((NullableTransformer<T, Comparable>) selector));
        }
    }

    /**
     * Sorts elements in the list in-place descending according to their natural sort order.
     */
    public static <T extends Comparable<T>> void sortDescending(@NotNull List<T> list) {
        //noinspection unchecked
        sortWith(list, (Comparator<T>) Comparisonx.reverseOrder());
    }

    /**
     * Returns a list of all elements sorted according to the specified [comparator].
     */
    @NotNull
    public static <T> List<T> sortedWith(@NotNull Iterable<T> iterable, @NotNull Comparator<T> comparator) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return toList(iterable);
            } else {
                //noinspection unchecked
                T[] result = (T[]) collection.toArray();
                Arrayx.sortWith(result, comparator);
                return Arrays.asList(result);
            }
        } else {
            List<T> result = toList(iterable);
            sortWith(result, comparator);
            return result;
        }
    }

    /**
     * Returns a list of all elements sorted according to natural sort order of the value returned by specified [selector] function.
     */
    @NotNull
    public static <T, R extends Comparable<R>> List<T> sortedBy(@NotNull Iterable<T> iterable, @NotNull NullableTransformer<T, R> selector) {
        //noinspection unchecked
        return sortedWith(iterable, Comparisonx.compareBy((NullableTransformer<T, Comparable>) selector));
    }

    /**
     * Returns a list of all elements sorted according to their natural sort order.
     */
    @NotNull
    public static <T extends Comparable<T>> List<T> sorted(@NotNull Iterable<T> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return toList(iterable);
            } else {
                //noinspection unchecked
                T[] result = (T[]) collection.toArray();
                Arrayx.sort(result);
                return Arrays.asList(result);
            }
        } else {
            List<T> result = toList(iterable);
            sort(result);
            return result;
        }
    }

    /**
     * Returns a list of all elements sorted descending according to natural sort order of the value returned by specified [selector] function.
     */
    @NotNull
    public static <T, R extends Comparable<R>> List<T> sortedByDescending(@NotNull Iterable<T> iterable, @NotNull NullableTransformer<T, R> selector) {
        //noinspection unchecked
        return sortedWith(iterable, Comparisonx.compareByDescending((NullableTransformer<T, Comparable>) selector));
    }

    /**
     * Returns a list of all elements sorted descending according to their natural sort order.
     */
    @NotNull
    public static <T extends Comparable<T>> List<T> sortedDescending(@NotNull Iterable<T> iterable) {
        //noinspection unchecked
        return sortedWith(iterable, (Comparator<T>) Comparisonx.reverseOrder());
    }


    /**
     * Reverses elements in the list in-place.
     */
    public static <T> void reverse(@NotNull List<T> list) {
        java.util.Collections.reverse(list);
    }

    /**
     * Returns a list with elements in reversed order.
     */
    @NotNull
    public static <T> List<T> reversed(@NotNull Iterable<T> iterable) {
        if (iterable instanceof Collection && ((Collection) iterable).size() <= 1) {
            return toList(iterable);
        } else {
            List<T> list = toList(iterable);
            reverse(list);
            return list;
        }
    }


    /**
     * Returns first index of [element], or -1 if the collection does not contain element.
     */
    public static <T> int indexOf(@NotNull Iterable<T> iterable, @NotNull T element) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(element);
        } else {
            int index = 0;
            for (T item : iterable) {
                if (element == item) {
                    return index;
                }
                index++;
            }
            return -1;
        }
    }

    /**
     * Returns first index of [element], or -1 if the list does not contain element.
     */
    public static <T> int indexOf(@NotNull List<T> list, T element) {
        return list.indexOf(element);
    }

    /**
     * Returns index of the first element matching the given [predicate], or -1 if the collection does not contain such element.
     */
    public static <T> int indexOfFirst(@NotNull Iterable<T> iterable, @NotNull Transformer<T, Boolean> predicate) {
        int index = 0;
        for (T item : iterable) {
            if (predicate.transform(item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    /**
     * Returns index of the first element matching the given [predicate], or -1 if the list does not contain such element.
     */
    public static <T> int indexOfFirst(@NotNull List<T> list, @NotNull Transformer<T, Boolean> predicate) {
        int index = 0;
        for (T item : list) {
            if (predicate.transform(item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    /**
     * Returns index of the last element matching the given [predicate], or -1 if the collection does not contain such element.
     */
    public static <T> int indexOfLast(@NotNull Iterable<T> iterable, @NotNull Transformer<T, Boolean> predicate) {
        int lastIndex = -1;
        int index = 0;
        for (T item : iterable) {
            if (predicate.transform(item)) {
                lastIndex = index;
            }
            index++;
        }
        return lastIndex;
    }

    /**
     * Returns index of the last element matching the given [predicate], or -1 if the list does not contain such element.
     */
    public static <T> int indexOfLast(@NotNull List<T> list, @NotNull Transformer<T, Boolean> predicate) {
        ListIterator<T> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            if (predicate.transform(iterator.previous())) {
                return iterator.nextIndex();
            }
        }
        return -1;
    }


    /**
     * Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
     */
    @NotNull
    public static <T, R> R fold(@NotNull Iterable<T> iterable, @NotNull R initial, @NotNull Operation<T, R> operation) {
        R accumulator = initial;
        for (T element : iterable) {
            accumulator = operation.operation(accumulator, element);
        }
        return accumulator;
    }

    /**
     * Accumulates value starting with [initial] value and applying [operation] from left to right
     * to current accumulator value and each element with its index in the original collection.
     *
     * @param operation function that takes the index of an element, current accumulator value
     *                  and the element itself, and calculates the next accumulator value.
     */
    @NotNull
    public static <T, R> R foldIndexed(@NotNull Iterable<T> iterable, @NotNull R initial, @NotNull IndexedOperation<T, R> operation) {
        int index = 0;
        R accumulator = initial;
        for (T element : iterable) {
            accumulator = operation.operation(index++, accumulator, element);
        }
        return accumulator;
    }

    /**
     * Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
     */
    @NotNull
    public static <T, R> R foldRight(@NotNull List<T> list, @NotNull R initial, @NotNull RightOperation<T, R> operation) {
        R accumulator = initial;
        if (!list.isEmpty()) {
            ListIterator<T> iterator = list.listIterator(list.size());
            while (iterator.hasPrevious()) {
                accumulator = operation.operation(iterator.previous(), accumulator);
            }
        }
        return accumulator;
    }

    /**
     * Accumulates value starting with [initial] value and applying [operation] from right to left
     * to each element with its index in the original list and current accumulator value.
     *
     * @param operation function that takes the index of an element, the element itself
     *                  and current accumulator value, and calculates the next accumulator value.
     */
    @NotNull
    public static <T, R> R foldRightIndexed(@NotNull List<T> list, @NotNull R initial, @NotNull IndexedRightOperation<T, R> operation) {
        R accumulator = initial;
        if (!list.isEmpty()) {
            ListIterator<T> iterator = list.listIterator(list.size());
            while (iterator.hasPrevious()) {
                int index = iterator.previousIndex();
                accumulator = operation.operation(index, iterator.previous(), accumulator);
            }
        }
        return accumulator;
    }


    /**
     * Accumulates value starting with the first element and applying [operation] from left to right to current accumulator value and each element.
     */
    @NotNull
    public static <S, T extends S> S reduce(@NotNull Iterable<T> iterable, @NotNull Operation<T, S> operation) {
        Iterator<T> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S accumulator = iterator.next();
        while (iterator.hasNext()) {
            accumulator = operation.operation(accumulator, iterator.next());
        }
        return accumulator;
    }

    /**
     * Accumulates value starting with the first element and applying [operation] from left to right
     * to current accumulator value and each element with its index in the original collection.
     *
     * @param operation function that takes the index of an element, current accumulator value
     *                  and the element itself and calculates the next accumulator value.
     */
    @NotNull
    public static <S, T extends S> S reduceIndexed(@NotNull Iterable<T> iterable, @NotNull IndexedOperation<T, S> operation) {
        Iterator<T> iterator = iterable.iterator();
        if (!iterator.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        int index = 1;
        S accumulator = iterator.next();
        while (iterator.hasNext()) {
            accumulator = operation.operation(index++, accumulator, iterator.next());
        }
        return accumulator;
    }

    /**
     * Accumulates value starting with last element and applying [operation] from right to left to each element and current accumulator value.
     */
    @NotNull
    public static <S, T extends S> S reduceRight(@NotNull List<T> list, @NotNull RightOperation<T, S> operation) {
        ListIterator<T> iterator = list.listIterator(list.size());
        if (!iterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S accumulator = iterator.previous();
        while (iterator.hasPrevious()) {
            accumulator = operation.operation(iterator.previous(), accumulator);
        }
        return accumulator;
    }

    /**
     * Accumulates value starting with last element and applying [operation] from right to left
     * to each element with its index in the original list and current accumulator value.
     *
     * @param operation function that takes the index of an element, the element itself
     *                  and current accumulator value, and calculates the next accumulator value.
     */
    @NotNull
    public static <S, T extends S> S reduceRightIndexed(@NotNull List<T> list, @NotNull IndexedRightOperation<T, S> operation) {
        ListIterator<T> iterator = list.listIterator(list.size());
        if (!iterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S accumulator = iterator.previous();
        while (iterator.hasPrevious()) {
            int index = iterator.previousIndex();
            accumulator = operation.operation(index, iterator.previous(), accumulator);
        }
        return accumulator;
    }


    /**
     * Returns a list containing elements at specified [indices].
     */
    public static <T> List<T> slice(List<T> list, Iterable<Integer> indices) {
        int size = collectionSizeOrDefault(indices, 10);
        if (size == 0) {
            //noinspection unchecked
            return EMPTY_LIST;
        } else {
            ArrayList<T> resultList = new ArrayList<T>(size);
            for (int index : indices) {
                resultList.add(list.get(index));
            }
            return resultList;
        }
    }

    /**
     * Returns a list containing first [n] elements.
     */
    public static <T> List<T> take(Iterable<T> iterable, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Requested element count $n is less than zero.");
        }
        if (n == 0) {
            //noinspection unchecked
            return EMPTY_LIST;
        }
        if (iterable instanceof Collection) {
            if (n >= ((Collection) iterable).size()) {
                return toList(iterable);
            }
            if (n == 1) {
                return listOf(first(iterable));
            }
        }
        int count = 0;
        ArrayList<T> list = new ArrayList<T>(n);
        for (T item : iterable) {
            if (count++ == n)
                break;
            list.add(item);
        }
        return list;
    }

    /**
     * Returns a list containing last [n] elements.
     */
    public static <T> List<T> takeLast(List<T> list, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Requested element count $n is less than zero.");
        }
        if (n == 0) {
            //noinspection unchecked
            return EMPTY_LIST;
        }
        int size = list.size();
        if (n >= size) {
            return toList(list);
        }
        if (n == 1) {
            return listOf(last(list));
        }
        ArrayList<T> resultList = new ArrayList<T>(n);
        if (list instanceof RandomAccess) {
            for (int index = size - n; index < size; index++) {
                resultList.add(list.get(index));
            }
        } else {
            ListIterator<T> listIterator = list.listIterator(size - n);
            while (listIterator.hasNext()) {
                T item = listIterator.next();
                resultList.add(item);
            }
        }
        return resultList;
    }

    /**
     * Returns a list containing last elements satisfying the given [predicate].
     */
    public static <T> List<T> takeLastWhile(List<T> list, Predicate<T> predicate) {
        if (list.isEmpty()) {
            //noinspection unchecked
            return EMPTY_LIST;
        }
        ListIterator<T> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            if (!predicate.predicate(iterator.previous())) {
                iterator.next();
                int expectedSize = list.size() - iterator.nextIndex();
                if (expectedSize == 0) return emptyList();
                ArrayList<T> resultList = new ArrayList<T>(expectedSize);
                while (iterator.hasNext()) {
                    resultList.add(iterator.next());
                }
                return resultList;
            }
        }
        return toList(list);
    }

    /**
     * Returns a list containing first elements satisfying the given [predicate].
     */
    public static <T> List<T> takeWhile(Iterable<T> iterable, Predicate<T> predicate) {
        ArrayList<T> list = new ArrayList<T>();
        for (T item : iterable) {
            if (!predicate.predicate(item))
                break;
            list.add(item);
        }
        return list;
    }

    // distinct/distinctBy
    // intersect/subtract
    // associate
    // drop
    // single
    // element
}
