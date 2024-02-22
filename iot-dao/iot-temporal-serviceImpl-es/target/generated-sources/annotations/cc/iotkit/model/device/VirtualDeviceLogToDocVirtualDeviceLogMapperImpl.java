package cc.iotkit.model.device;

import cc.iotkit.temporal.es.document.DocVirtualDeviceLog;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:55:34+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class VirtualDeviceLogToDocVirtualDeviceLogMapperImpl implements VirtualDeviceLogToDocVirtualDeviceLogMapper {

    @Override
    public DocVirtualDeviceLog convert(VirtualDeviceLog arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DocVirtualDeviceLog docVirtualDeviceLog = new DocVirtualDeviceLog();

        docVirtualDeviceLog.setId( arg0.getId() );
        docVirtualDeviceLog.setVirtualDeviceId( arg0.getVirtualDeviceId() );
        docVirtualDeviceLog.setVirtualDeviceName( arg0.getVirtualDeviceName() );
        docVirtualDeviceLog.setDeviceTotal( arg0.getDeviceTotal() );
        docVirtualDeviceLog.setResult( arg0.getResult() );
        docVirtualDeviceLog.setLogAt( arg0.getLogAt() );

        return docVirtualDeviceLog;
    }

    @Override
    public DocVirtualDeviceLog convert(VirtualDeviceLog arg0, DocVirtualDeviceLog arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setVirtualDeviceId( arg0.getVirtualDeviceId() );
        arg1.setVirtualDeviceName( arg0.getVirtualDeviceName() );
        arg1.setDeviceTotal( arg0.getDeviceTotal() );
        arg1.setResult( arg0.getResult() );
        arg1.setLogAt( arg0.getLogAt() );

        return arg1;
    }
}
