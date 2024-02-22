package cc.iotkit.data.model;

import cc.iotkit.model.notify.ChannelConfig;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbChannelConfigToChannelConfigMapperImpl implements TbChannelConfigToChannelConfigMapper {

    @Autowired
    private ChannelConfigMapper channelConfigMapper;

    @Override
    public ChannelConfig convert(TbChannelConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ChannelConfig channelConfig = new ChannelConfig();

        channelConfig.setId( arg0.getId() );
        channelConfig.setChannelId( arg0.getChannelId() );
        channelConfig.setTitle( arg0.getTitle() );
        channelConfig.setParam( channelConfigMapper.stingToParam( arg0.getParam() ) );
        channelConfig.setCreateAt( arg0.getCreateAt() );

        return channelConfig;
    }

    @Override
    public ChannelConfig convert(TbChannelConfig arg0, ChannelConfig arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setChannelId( arg0.getChannelId() );
        arg1.setTitle( arg0.getTitle() );
        arg1.setParam( channelConfigMapper.stingToParam( arg0.getParam() ) );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
