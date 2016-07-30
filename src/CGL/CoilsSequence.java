package CGL;

import GeneticAlgorithm.GAMain.Chromosome;

import java.util.ArrayList;

/**
 * CoilsSequence extends Chromosome as it will have id, and also will
 * store a list of the coils id.
 * @author Shimon
 */
public class CoilsSequence extends Chromosome {
	public static int MAX_SEQUENCE_SIZE = 1000;
	ArrayList<Integer> coils_list = new ArrayList<Integer>();
}
