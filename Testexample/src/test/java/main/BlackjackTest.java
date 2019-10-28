package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlackjackTest {

	private BlackJack jack = new BlackJack();

	@Test
	public void testHighestWins() {
		assertEquals("Highest number did not win", 21, jack.play(16, 21));

	}

	@Test
	public void testOneBust() {
		assertEquals("Player 1 has bust but still won", 21, jack.play(22, 21));
	}

	@Test
	public void testTwoBust() {
		assertEquals("Player 2 has bust but still won", 21, jack.play(21, 22));
	}
	
	@Test
	public void testBothBust() {
		assertEquals("Both are bust but 0 has not been returned", 0, jack.play(22, 22));
	}
}