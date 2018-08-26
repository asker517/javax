package me.panpf.javax.io;

/**
 * An enumeration to describe possible walk directions.
 * There are two of them: beginning from parents, ending with children,
 * and beginning from children, ending with parents. Both use depth-first search.
 */
public enum FileWalkDirection {
    /**
     * Depth-first search, directory is visited BEFORE its files
     */
    TOP_DOWN,
    /**
     * Depth-first search, directory is visited AFTER its files
     */
    BOTTOM_UP
    // Do we want also breadth-first search?
}
