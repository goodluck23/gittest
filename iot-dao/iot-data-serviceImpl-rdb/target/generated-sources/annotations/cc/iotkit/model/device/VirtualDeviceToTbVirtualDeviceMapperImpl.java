package cc.iotkit.model.device;

import cc.iotkit.data.model.TbVirtualDevice;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class VirtualDeviceToTbVirtualDeviceMapperImpl implements VirtualDeviceToTbVirtualDeviceMapper {

    @Override
    public TbVirtualDevice convert(VirtualDevice arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbVirtualDevice tbVirtualDevice = new TbVirtualDevice();

        tbVirtualDevice.setId( arg0.getId() );
        tbVirtualDevice.setUid( arg0.getUid() );
        tbVirtualDevice.setName( arg0.getName() );
        tbVirtualDevice.setProductKey( arg0.getProductKey() );
        tbVirtualDevice.setType( arg0.getType() );
        tbVirtualDevice.setScript( arg0.getScript() );
        tbVirtualDevice.setTrigger( arg0.getTrigger() );
        tbVirtualDevice.setTriggerExpression( arg0.getTriggerExpression() );
        tbVirtualDevice.setState( arg0.getState() );
        tbVirtualDevice.setCreateAt( arg0.getCreateAt() );

        return tbVirtualDevice;
    }

    @Override
    public TbVirtualDevice convert(VirtualDevice arg0, TbVirtualDevice arg1) {
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
