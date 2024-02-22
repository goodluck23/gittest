package cc.iotkit.data.model;

import cc.iotkit.model.notify.Channel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbChannelToChannelMapperImpl implements TbChannelToChannelMapper {

    @Override
    public Channel convert(TbChannel arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Channel channel = new Channel();

        channel.setId( arg0.getId() );
        channel.setCode( arg0.getCode() );
        channel.setTitle( arg0.getTitle() );
        channel.setIcon( arg0.getIcon() );
        channel.setCreateAt( arg0.getCreateAt() );

        return channel;
    }

    @Override
    public Channel convert(TbChannel arg0, Channel arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setCode( arg0.getCode() );
        arg1.setTitle( arg0.getTitle() );
        arg1.setIcon( arg0.getIcon() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
