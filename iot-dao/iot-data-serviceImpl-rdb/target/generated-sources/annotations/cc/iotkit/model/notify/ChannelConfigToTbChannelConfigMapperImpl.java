package cc.iotkit.model.notify;

import cc.iotkit.data.model.ChannelConfigMapper;
import cc.iotkit.data.model.TbChannelConfig;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ChannelConfigToTbChannelConfigMapperImpl implements ChannelConfigToTbChannelConfigMapper {

    @Autowired
    private ChannelConfigMapper channelConfigMapper;

    @Override
    public TbChannelConfig convert(ChannelConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbChannelConfig tbChannelConfig = new TbChannelConfig();

        tbChannelConfig.setId( arg0.getId() );
        tbChannelConfig.setChannelId( arg0.getChannelId() );
        tbChannelConfig.setTitle( arg0.getTitle() );
        tbChannelConfig.setParam( channelConfigMapper.paramToSting( arg0.getParam() ) );
        tbChannelConfig.setCreateAt( arg0.getCreateAt() );

        return tbChannelConfig;
    }

    @Override
    public TbChannelConfig convert(ChannelConfig arg0, TbChannelConfig arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setChannelId( arg0.getChannelId() );
        arg1.setTitle( arg0.getTitle() );
        arg1.setParam( channelConfigMapper.paramToSting( arg0.getParam() ) );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
