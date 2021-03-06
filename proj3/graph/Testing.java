package graph;

import org.junit.Test;
import ucb.junit.textui;
import static org.junit.Assert.*;

/* You MAY add public @Test methods to this class.  You may also add
 * additional public classes containing "Testing" in their name. These
 * may not be part of your graph package per se (that is, it must be
 * possible to remove them and still have your package work). */

/** Unit tests for the graph package.
 *  @author Kiet Lam
 */
public class Testing {

    /** Run all JUnit tests in the graph package. */
    public static void main(String[] ignored) {
        textui.runClasses(graph.Testing.class);
        textui.runClasses(graph.UndirectedGraphTesting.class);
        textui.runClasses(graph.DirectedGraphTesting.class);
        textui.runClasses(graph.TraversalTesting.class);
        textui.runClasses(graph.GraphsTesting.class);
    }

    @Test
    public void emptyGraph() {
        DirectedGraph g = new DirectedGraph();
        assertEquals("Initial graph has vertices", 0, g.vertexSize());
        assertEquals("Initial graph has edges", 0, g.edgeSize());
    }
}
