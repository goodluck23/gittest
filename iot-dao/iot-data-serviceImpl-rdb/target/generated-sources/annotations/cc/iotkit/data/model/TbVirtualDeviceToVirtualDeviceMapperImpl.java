package cc.iotkit.data.model;

import cc.iotkit.model.device.VirtualDevice;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbVirtualDeviceToVirtualDeviceMapperImpl implements TbVirtualDeviceToVirtualDeviceMapper {

    @Override
    public VirtualDevice convert(TbVirtualDevice arg0) {
        if ( arg0 == null ) {
            return null;
        }

        VirtualDevice virtualDevice = new VirtualDevice();

        virtualDevice.setId( arg0.getId() );
        virtualDevice.setUid( arg0.getUid() );
        virtualDevice.setName( arg0.getName() );
        virtualDevice.setProductKey( arg0.getProductKey() );
        virtualDevice.setType( arg0.getType() );
        virtualDevice.setScript( arg0.getScript() );
        virtualDevice.setTrigger( arg0.getTrigger() );
        virtualDevice.setTriggerExpression( arg0.getTriggerExpression() );
        virtualDevice.setState( arg0.getState() );
        virtualDevice.setCreateAt( arg0.getCreateAt() );

        return virtualDevice;
    }

    @Override
    public VirtualDevice convert(TbVirtualDevice arg0, VirtualDevice arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setUid( arg0.getUid() );
        arg1.setName( arg0.getName() );
        arg1.setProductKey( arg0.getProductKey() );
        arg1.setType( arg0.getType() );
        arg1.setScript( arg0.getScript() );
        arg1.setTrigger( arg0.getTrigger() );
        arg1.setTriggerExpression( arg0.getTriggerExpression() );
        arg1.setState( arg0.getState() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
