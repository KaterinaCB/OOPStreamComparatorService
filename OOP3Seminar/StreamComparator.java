import java.util.List;

public class StreamComparator implements Comparable<Stream>{
    List<StudentGroup> studentGroupList;
    @Override
    public int compareTo(Stream o) {
        if(studentGroupList.size() > o.size()){
            return 1;
        }
        if(studentGroupList.size() < o.size()) {
            return -1;
        }
        return 0;
    }
}
