package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPositionTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell expected = bishopBlack.position();
        Cell actual = Cell.C8;
        assertEquals(expected, actual);
    }

    @Test
    public void whenCopyTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure newBishopBlack = bishopBlack.copy(Cell.C5);
        Cell newPosition = newBishopBlack.position();
        assertEquals(Cell.C5, newPosition);
    }

    @Test
    public void whenWayTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenDiagonalMoveFromC1ToH6IsTrue() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell startCell = Cell.C1;
        Cell finishCell = Cell.H6;
        assertTrue(bishopBlack.isDiagonal(startCell, finishCell));
    }

    @Test
    public void whenDiagonalMoveFromC1ToH5IsFalse() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell startCell = Cell.C1;
        Cell finishCell = Cell.H5;
        assertFalse(bishopBlack.isDiagonal(startCell, finishCell));
    }
}