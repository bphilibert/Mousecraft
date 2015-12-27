package java.craft;

import main.java.fr.craft.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by bphilibert on 2015/12/14.
 */
public class test1
{
    @Test
    public void test1 ()
    {
        Feature oak_hardness = new Feature(Features.HARDNESS, 3);
        Feature oak_flexibility = new Feature(Features.FLEXIBILITY, 3);
        Feature oak_resilience = new Feature(Features.RESILIENCE, 4);
        Feature oak_density = new Feature(Features.DENSITY, 2);

        ArrayList<Feature> oak_features = new ArrayList<>();
        oak_features.add(oak_hardness);
        oak_features.add(oak_flexibility);
        oak_features.add(oak_resilience);
        oak_features.add(oak_density);

        Material oak = new Material("Oak", "A piece of oak", oak_features, 5);

        Feature pinus_hardness = new Feature(Features.HARDNESS, 2);
        Feature pinus_flexibility = new Feature(Features.FLEXIBILITY, 4);
        Feature pinus_resilience = new Feature(Features.RESILIENCE, 4);
        Feature pinus_density = new Feature(Features.DENSITY, 1);

        ArrayList<Feature> pinus_features = new ArrayList<>();
        pinus_features.add(pinus_hardness);
        pinus_features.add(pinus_flexibility);
        pinus_features.add(pinus_resilience);
        pinus_features.add(pinus_density);

        Material pinus = new Material("Pinus", "A piece of pinus", pinus_features, 10);

        Feature boxwood_hardness = new Feature(Features.HARDNESS, 5);
        Feature boxwood_flexibility = new Feature(Features.FLEXIBILITY, 2);
        Feature boxwood_resilience = new Feature(Features.RESILIENCE, 4);
        Feature boxwood_density = new Feature(Features.DENSITY, 2);

        ArrayList<Feature> boxwood_features = new ArrayList<>();
        boxwood_features.add(boxwood_hardness);
        boxwood_features.add(boxwood_flexibility);
        boxwood_features.add(boxwood_resilience);
        boxwood_features.add(boxwood_density);

        Material boxwood = new Material("Boxwood", "A piece of boxwood", boxwood_features, 5);

        Feature iron_hardness = new Feature(Features.HARDNESS, 4);
        Feature iron_flexibility = new Feature(Features.FLEXIBILITY, 3);
        Feature iron_resilience = new Feature(Features.RESILIENCE, 3);
        Feature iron_density = new Feature(Features.DENSITY, 4);

        ArrayList<Feature> iron_features = new ArrayList<>();
        iron_features.add(iron_hardness);
        iron_features.add(iron_flexibility);
        iron_features.add(iron_resilience);
        iron_features.add(iron_density);

        Material iron = new Material("Iron", "A piece of iron", iron_features, 1);

        Feature gold_hardness = new Feature(Features.HARDNESS, 3);
        Feature gold_flexibility = new Feature(Features.FLEXIBILITY, 4);
        Feature gold_resilience = new Feature(Features.RESILIENCE, 4);
        Feature gold_density = new Feature(Features.DENSITY, 5);

        ArrayList<Feature> gold_features = new ArrayList<>();
        gold_features.add(gold_hardness);
        gold_features.add(gold_flexibility);
        gold_features.add(gold_resilience);
        gold_features.add(gold_density);

        Material gold = new Material("Gold", "A piece of gold", gold_features, 5);

        Feature wool_hardness = new Feature(Features.HARDNESS, 1);
        Feature wool_flexibility = new Feature(Features.FLEXIBILITY, 5);
        Feature wool_resilience = new Feature(Features.RESILIENCE, 5);
        Feature wool_density = new Feature(Features.DENSITY, 1);

        ArrayList<Feature> wool_features = new ArrayList<>();
        wool_features.add(wool_hardness);
        wool_features.add(wool_flexibility);
        wool_features.add(wool_resilience);
        wool_features.add(wool_density);

        Material wool = new Material("Wool", "A piece of wool", wool_features, 5);

        Feature silex_hardness = new Feature(Features.HARDNESS, 5);
        Feature silex_flexibility = new Feature(Features.FLEXIBILITY, 1);
        Feature silex_resilience = new Feature(Features.RESILIENCE, 1);
        Feature silex_density = new Feature(Features.DENSITY, 4);

        ArrayList<Feature> silex_features = new ArrayList<>();
        silex_features.add(silex_hardness);
        silex_features.add(silex_flexibility);
        silex_features.add(silex_resilience);
        silex_features.add(silex_density);

        Material silex = new Material("Silex", "A piece of silex", silex_features, 5);

        Feature iron_saw_hardness = new Feature(Features.HARDNESS, 2);
        Feature iron_saw_flexibility = new Feature(Features.FLEXIBILITY, 2);
        Feature iron_saw_resilience = new Feature(Features.RESILIENCE, 2);
        Feature iron_saw_density = new Feature(Features.DENSITY, 4);

        ArrayList<Feature> iron_saw_features = new ArrayList<>();
        iron_saw_features.add(iron_saw_hardness);
        iron_saw_features.add(iron_saw_flexibility);
        iron_saw_features.add(iron_saw_resilience);
        iron_saw_features.add(iron_saw_density);

        Function iron_saw_function = new Function(Features.HARDNESS, 0, iron_saw_hardness.getValue());

        ArrayList<Function> iron_saw_functions = new ArrayList<>();
        iron_saw_functions.add(iron_saw_function);

        Tool iron_saw = new Tool("An iron saw", "An iron saw to cut wood", iron_saw_features, iron_saw_functions);

        Feature steel_saw_hardness = new Feature(Features.HARDNESS, 4);
        Feature steel_saw_flexibility = new Feature(Features.FLEXIBILITY, 4);
        Feature steel_saw_resilience = new Feature(Features.RESILIENCE, 4);
        Feature steel_saw_density = new Feature(Features.DENSITY, 2);

        ArrayList<Feature> steel_saw_features = new ArrayList<>();
        steel_saw_features.add(steel_saw_hardness);
        steel_saw_features.add(steel_saw_flexibility);
        steel_saw_features.add(steel_saw_resilience);
        steel_saw_features.add(steel_saw_density);

        Function steel_saw_function = new Function(Features.HARDNESS, 0, steel_saw_hardness.getValue());

        ArrayList<Function> steel_saw_functions = new ArrayList<>();
        steel_saw_functions.add(steel_saw_function);

        Tool steel_saw = new Tool("A steel saw", "A steel saw to cut wood", steel_saw_features, steel_saw_functions);

        Feature oak_hammer_hardness = new Feature(Features.HARDNESS, 3);
        Feature oak_hammer_flexibility = new Feature(Features.FLEXIBILITY, 3);
        Feature oak_hammer_resilience = new Feature(Features.RESILIENCE, 4);
        Feature oak_hammer_density = new Feature(Features.DENSITY, 2);

        ArrayList<Feature> oak_hammer_features = new ArrayList<>();
        oak_hammer_features.add(oak_hammer_hardness);
        oak_hammer_features.add(oak_hammer_flexibility);
        oak_hammer_features.add(oak_hammer_resilience);
        oak_hammer_features.add(oak_hammer_density);

        Function oak_hammer_function = new Function(Features.HARDNESS, 0, oak_hammer_hardness.getValue());

        ArrayList<Function> oak_hammer_functions = new ArrayList<>();
        oak_hammer_functions.add(oak_hammer_function);

        Tool oak_hammer = new Tool("A oak hammer", "A hammer in oak", oak_hammer_features, oak_hammer_functions);

        Feature steel_hammer_hardness = new Feature(Features.HARDNESS, 4);
        Feature steel_hammer_flexibility = new Feature(Features.FLEXIBILITY, 4);
        Feature steel_hammer_resilience = new Feature(Features.RESILIENCE, 4);
        Feature steel_hammer_density = new Feature(Features.DENSITY, 2);

        ArrayList<Feature> steel_hammer_features = new ArrayList<>();
        steel_hammer_features.add(steel_hammer_hardness);
        steel_hammer_features.add(steel_hammer_flexibility);
        steel_hammer_features.add(steel_hammer_resilience);
        steel_hammer_features.add(steel_hammer_density);

        Function steel_hammer_function = new Function(Features.HARDNESS, 0, steel_hammer_hardness.getValue());

        ArrayList<Function> steel_hammer_functions = new ArrayList<>();
        steel_hammer_functions.add(steel_hammer_function);

        Tool steel_hammer = new Tool("A steel hammer", "A hammer in steel", steel_hammer_features, steel_hammer_functions);

        ArrayList<Supply> firstStep = new ArrayList<>();
        firstStep.add(oak);
        firstStep.add(boxwood);
        firstStep.add(gold);
        firstStep.add(iron);
        firstStep.add(pinus);
        ArrayList<Supply> secondStep = new ArrayList<>();
        secondStep.add(iron_saw);
        secondStep.add(steel_saw);

        LinkedList<ArrayList<Supply>> protocol = new LinkedList<>();
        protocol.add(firstStep);
        protocol.add(secondStep);

        Item stick = new Item("A wooden stick", "A stick made of wood !");
        Design stick_design = new Design("A stick design", "A design to make a stick",
                protocol, stick, "/tmp/stick.jpg");


    }
}
