package model;

import model.position.Position;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Results {
    private final Map<Position, Result> results;

    public Results(List<String> results) {
        this.results = new LinkedHashMap<>();
        for (int i = 0; i < results.size(); i++) {
            this.results.put(new Position(i), new Result(results.get(i)));
        }
    }

    public Result getResult(Position position) {
        return this.results.get(position);
    }
}
