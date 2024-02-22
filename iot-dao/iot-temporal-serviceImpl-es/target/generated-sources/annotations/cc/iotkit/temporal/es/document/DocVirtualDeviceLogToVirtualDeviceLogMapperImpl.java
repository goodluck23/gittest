package cc.iotkit.temporal.es.document;

import cc.iotkit.model.device.VirtualDeviceLog;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:55:34+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class DocVirtualDeviceLogToVirtualDeviceLogMapperImpl implements DocVirtualDeviceLogToVirtualDeviceLogMapper {

    @Override
    public VirtualDeviceLog convert(DocVirtualDeviceLog arg0) {
        if ( arg0 == null ) {
            return null;
        }

        VirtualDeviceLog virtualDeviceLog = new VirtualDeviceLog();

        virtualDeviceLog.setId( arg0.getId() );
        virtualDeviceLog.setVirtualDeviceId( arg0.getVirtualDeviceId() );
        virtualDeviceLog.setVirtualDeviceName( arg0.getVirtualDeviceName() );
        virtualDeviceLog.setDeviceTotal( arg0.getDeviceTotal() );
        virtualDeviceLog.setResult( arg0.getResult() );
        virtualDeviceLog.setLogAt( arg0.getLogAt() );

        return virtualDeviceLog;
    }

    @Override
    public VirtualDeviceLog convert(DocVirtualDeviceLog arg0, VirtualDeviceLog arg1) {
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
