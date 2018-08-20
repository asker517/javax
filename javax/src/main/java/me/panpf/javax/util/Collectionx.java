package me.panpf.javax.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

@SuppressWarnings({"WeakerAccess", "unused"})
public class Collectionx {


    public static int collectionSizeOrDefault(@NotNull Iterable iterable, int defaultValue) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : defaultValue;
    }

    /**
     * Appends all elements matching the given [predicate] to the given [destination].
     */
    @NotNull
    public static <T, C extends Collection<T>> C filterTo(@NotNull Iterable<T> iterable, @NotNull C destination, @NotNull Predicate<T> predicate) {
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
    public static <T, C extends Collection<T>> C filterNotTo(@NotNull Iterable<T> iterable, @NotNull C destination, @NotNull Predicate<T> predicate) {
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
    public static <T, C extends Collection<T>> C filterIndexedTo(@NotNull Iterable<T> iterable, @NotNull C destination, @NotNull IndexedPredicate<T> predicate) {
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
    public static <C extends Collection<R>, R> C filterIsInstanceTo(@NotNull Iterable<?> iterable, @NotNull C destination, @NotNull Class<R> klass) {
        for (Object element : iterable) {
            if (klass.isInstance(element)) {
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
    public static <R> List<R> filterIsInstance(@NotNull Iterable<?> iterable, @NotNull Class<R> klass) {
        return filterIsInstanceTo(iterable, new ArrayList<R>(), klass);
    }


    /**
     * Applies the given [transform] function to each element of the original collection
     * and appends the results to the given [destination].
     */
    @NotNull
    public static <Data, Result, D extends Collection<Result>> D mapTo(@NotNull Iterable<Data> iterable, @NotNull D destination, @NotNull Transformer<Data, Result> transform) {
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
    public static <Data, Result, D extends Collection<Result>> D mapIndexedTo(@NotNull Iterable<Data> iterable, @NotNull D destination, @NotNull IndexedTransformer<Data, Result> transform) {
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
    public static <Data, Result, D extends Collection<Result>> D mapNotNullTo(@NotNull Iterable<Data> iterable, @NotNull D destination, @NotNull NullableTransformer<Data, Result> transform) {
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
    public static <Data, Result, D extends Collection<Result>> D mapIndexedNotNullTo(@NotNull Iterable<Data> iterable, @NotNull D destination, @NotNull NullableIndexedTransformer<Data, Result> transform) {
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
    public static <Data, Result> List<Result> mapIndexedNotNull(@NotNull Iterable<Data> iterable, @NotNull NullableIndexedTransformer<Data, Result> transform) {
        return mapIndexedNotNullTo(iterable, new ArrayList<Result>(collectionSizeOrDefault(iterable, 10)), transform);
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
    public static <T> int sumBy(Iterable<T> iterable, Transformer<T, Integer> selector) {
        int sum = 0;
        for (T element : iterable) {
            sum += selector.transform(element);
        }
        return sum;
    }

    /**
     * Returns the sum of all values produced by [selector] function applied to each element in the collection.
     */
    public static <T> double sumByDouble(Iterable<T> iterable, Transformer<T, Double> selector) {
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
     * Splits the original collection into pair of lists,
     * where *first* list contains elements for which [predicate] yielded `true`,
     * while *second* list contains elements for which [predicate] yielded `false`.
     */
    @NotNull
    public static <T> Pair<List<T>, List<T>> partition(@NotNull Iterable<T> iterable, @NotNull Predicate<T> predicate) {
        List<T> first = new ArrayList<>();
        List<T> second = new ArrayList<>();
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
    public static <T> boolean none(Iterable<T> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        } else {
            return !iterable.iterator().hasNext();
        }
    }

    /**
     * Returns `true` if no elements match the given [predicate].
     */
    public static <T> boolean none(Iterable<T> iterable, Predicate<T> predicate) {
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
     * Performs the given [action] on each element.
     */
    public static <T> void forEach(Iterable<T> iterable, Action<T> action) {
        for (T element : iterable) action.action(element);
    }

    /**
     * Performs the given [action] on each element, providing sequential index with the element.
     *
     * @param action function that takes the index of an element and the element itself
     *               and performs the desired action on the element.
     */
    public static <T> void forEachIndexed(Iterable<T> iterable, IndexedAction<T> action) {
        int index = 0;
        for (T item : iterable) {
            action.action(index++, item);
        }
    }

    // chunked
    // minus
    // plus
    // reduce
    // fold
    // flatMap
    // slice
    // take
    // reverse
    // to***
    // distinct/distinctBy
    // intersect/subtract
    // group
    // associate
    // sorted
    // drop
    // single
    // indexOf**/lastIndexOf
    // getOrElse/getOrNull
    // find
    // element
    // contains
}
