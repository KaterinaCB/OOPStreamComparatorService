import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private List<Stream> streamList;

    public StreamService(List<Stream> streamList) {
        this.streamList = streamList;
    }

    public List<Stream> getStreamList() {
        return streamList;
    }

    public List<Stream> getSortedStreamBySize(){
        List<Stream> streamList1 = new ArrayList<>(streamList);
        Collections.sort(streamList1);
        return streamList1;
    }
}
