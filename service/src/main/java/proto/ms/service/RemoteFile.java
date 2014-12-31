package proto.ms.service;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by civerson on 12/21/14.
 */
@Data
@Document
public class RemoteFile {

    private final @Id String id;
    private final String name;
    private final Date createDate;
    private final String fileRef;


    public RemoteFile(String name, String fileRef, Date createDate) {

        this.name = name;
        this.createDate = createDate;
        this.fileRef = fileRef;
        this.id = null;
    }

    protected RemoteFile() {

        this.id = null;
        this.name = null;
        this.fileRef = null;
        this.createDate = null;
    }

}
