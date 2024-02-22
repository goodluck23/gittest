package cc.iotkit.model.plugin;

import cc.iotkit.data.model.TbPluginInstance;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class PluginInstanceToTbPluginInstanceMapperImpl implements PluginInstanceToTbPluginInstanceMapper {

    @Override
    public TbPluginInstance convert(PluginInstance arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbPluginInstance tbPluginInstance = new TbPluginInstance();

        tbPluginInstance.setCreateDept( arg0.getCreateDept() );
        tbPluginInstance.setCreateBy( arg0.getCreateBy() );
        tbPluginInstance.setCreateTime( arg0.getCreateTime() );
        tbPluginInstance.setUpdateBy( arg0.getUpdateBy() );
        tbPluginInstance.setUpdateTime( arg0.getUpdateTime() );
        tbPluginInstance.setId( arg0.getId() );
        tbPluginInstance.setMainId( arg0.getMainId() );
        tbPluginInstance.setPluginId( arg0.getPluginId() );
        tbPluginInstance.setIp( arg0.getIp() );
        tbPluginInstance.setPort( arg0.getPort() );
        tbPluginInstance.setHeartbeatAt( arg0.getHeartbeatAt() );

        return tbPluginInstance;
    }

    @Override
    public TbPluginInstance convert(PluginInstance arg0, TbPluginInstance arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setMainId( arg0.getMainId() );
        arg1.setPluginId( arg0.getPluginId() );
        arg1.setIp( arg0.getIp() );
        arg1.setPort( arg0.getPort() );
        arg1.setHeartbeatAt( arg0.getHeartbeatAt() );

        return arg1;
    }
}
