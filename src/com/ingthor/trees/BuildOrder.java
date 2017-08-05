package com.ingthor.trees;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Ingthor on 29/04/2017.
 */
public class BuildOrder
{
    HashMap<Character, Links> graph;

    public BuildOrder(ArrayList<Character> projects, ArrayList<CharLink> dependencies)
    {
        graph = new HashMap<>();

        for(Character project : projects)
        {
            graph.put(project, new Links());
        }

        for(CharLink link : dependencies)
        {
            graph.get(link.from).to.add(link.to);
            graph.get(link.to).from.add(link.from);
        }
    }

    public ArrayList<Character> GetBuildOrder()
    {

        ArrayList<Character> buildOrder = new ArrayList<>();

        while(graph.size() > 0)
        {
            ArrayList<Character> itemsToRemove = new ArrayList<>();
            graph.forEach((character, links) -> {
                TryRemove(buildOrder, character, links, itemsToRemove);
            });
            for(Character itemToRemove : itemsToRemove)
            {
                graph.remove(itemToRemove);
            }
        }

        return buildOrder;
    }

    private void TryRemove(ArrayList<Character> buildOrder, Character character, Links links, ArrayList<Character> itemsToRemove) {
        if(links.from.size() < 1)
        {
            buildOrder.add(character);
            for(Character fromProject : links.to)
            {
                if(!buildOrder.contains(fromProject))
                {
                    Links subLinks = graph.get(fromProject);
                    subLinks.from.remove(character);
                    TryRemove(buildOrder, fromProject, subLinks, itemsToRemove);
                }
            }
            itemsToRemove.add(character);
        }
    }

    public class Links
    {
        ArrayList<Character> from;
        ArrayList<Character> to;

        public Links() {
            this.from = new ArrayList<>();
            this.to = new ArrayList<>();
        }
    }
}

