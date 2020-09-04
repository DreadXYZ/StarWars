package ru.dread.starwars.planets;

import ru.dread.starwars.structures.Structure;
import ru.dread.starwars.decor.Decoration;
import ru.dread.starwars.entity.Entity;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    private List<Structure> structures = new ArrayList<>();
    private List<Entity> entities = new ArrayList<>();
    private List<Decoration> decor = new ArrayList<>();

    private boolean isLoad;

    public Structure getStructure(int index) {
        return structures.get(index);
    }

    public void addStructures(Structure structure) {
        structures.add(structure);
    }

    public Entity getEntity(int index) {
        return entities.get(index);
    }

    public void addEntity(Entity entity) {
        entities.add(entity);
    }

    public Decoration getDecoration(int index) {
        return decor.get(index);
    }

    public void addDecoration(Decoration decoration) {
        decor.add(decoration);
    }

    public void setLoad(boolean load) {
        isLoad = load;
    }

    public boolean isLoad() {
        return isLoad;
    }
}