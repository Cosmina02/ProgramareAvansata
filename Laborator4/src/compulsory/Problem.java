package compulsory;

import java.util.List;
import java.util.Map;

public class Problem {
    Map<Student, List<School>> stdPrefMap;
    Map<School, List<Student>> hscPrefMap;

    public Problem(Map<Student, List<School>> stdPrefMap, Map<School, List<Student>> hscPrefMap) {
        this.stdPrefMap = stdPrefMap;
        this.hscPrefMap = hscPrefMap;
    }

    public Map<Student, List<School>> getStdPrefMap() {
        return stdPrefMap;
    }

    public Map<School, List<Student>> getHscPrefMap() {
        return hscPrefMap;
    }
}
