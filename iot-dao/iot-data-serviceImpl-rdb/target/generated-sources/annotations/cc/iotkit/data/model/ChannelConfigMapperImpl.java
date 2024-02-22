package cc.iotkit.data.model;

import cc.iotkit.model.notify.ChannelConfig;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ChannelConfigMapperImpl implements ChannelConfigMapper {

    @Override
    public ChannelConfig toDto(TbChannelConfig vo) {
        if ( vo == null ) {
            return null;
        }

        ChannelConfig.ChannelConfigBuilder channelConfig = ChannelConfig.builder();

        channelConfig.id( vo.getId() );
        channelConfig.channelId( vo.getChannelId() );
        channelConfig.title( vo.getTitle() );
        channelConfig.createAt( vo.getCreateAt() );

        channelConfig.param( stingToParam(vo.getParam()) );

        return channelConfig.build();
    }

    @Override
    public TbChannelConfig toVo(ChannelConfig dto) {
        if ( dto == null ) {
            return null;
        }

        TbChannelConfig tbChannelConfig = new TbChannelConfig();

        tbChannelConfig.setId( dto.getId() );
        tbChannelConfig.setChannelId( dto.getChannelId() );
        tbChannelConfig.setTitle( dto.getTitle() );
        tbChannelConfig.setCreateAt( dto.getCreateAt() );

        tbChannelConfig.setParam( paramToSting(dto.getParam()) );

        return tbChannelConfig;
    }
}
