package lab5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    Produto p1;
    Produto p2;

    @BeforeEach
    void setUp() {
        this.p1 = new Produto("2.50","Refri","Refri de guaraná");
        this.p2 = new Produto("3.00","Coxinha","Coxinha de frango");

    }

    @Test
    void getPreco() {
        assertEquals("2.50", this.p1.getPreco());
        assertEquals("3.00", this.p2.getPreco());
        assertNotEquals("4.00", this.p2.getPreco());
    }

    @Test
    void setPreco() {
        this.p1.setPreco("4.00");
        assertEquals("4.00", this.p1.getPreco());
        this.p2.setPreco("2.00");
        assertNotEquals("3.00", this.p2.getPreco());
    }

    @Test
    void getNome() {
        assertEquals("Refri", this.p1.getNome());
        assertEquals("Coxinha", this.p2.getNome());
        assertNotEquals("Doce", this.p2.getNome());
    }

    @Test
    void getDescricao() {
        assertEquals("Refri de guaraná", this.p1.getDescricao());
        assertEquals("Coxinha de frango", this.p2.getDescricao());
        assertNotEquals("Suco de morango", this.p2.getDescricao());
    }

    @Test
    void testEquals() {
        Produto p3 = new Produto("2.50", "Refri","Refri de guaraná");
        assertFalse(p2.getChave().equals(p1.getChave()));
        assertTrue(p1.getChave().equals(p3.getChave()));
    }

    @Test
    void testHashCode() {
        Produto p3 = new Produto("2.50", "Refri","Refri de guaraná");
        assertTrue(p1.hashCode() == p3.hashCode());
        assertFalse(p2.hashCode() == p3.hashCode());
    }

    @Test
    void testToString() {
        assertEquals("Refri - Refri de guaraná - R$2.50", this.p1.toString());
        assertNotEquals("Refri - Suco de guaraná - R$2.50", this.p2.toString());
    }
}