package cc.iotkit.data.model;

import cc.iotkit.model.plugin.PluginInstance;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbPluginInstanceToPluginInstanceMapperImpl implements TbPluginInstanceToPluginInstanceMapper {

    @Override
    public PluginInstance convert(TbPluginInstance arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PluginInstance pluginInstance = new PluginInstance();

        pluginInstance.setCreateDept( arg0.getCreateDept() );
        pluginInstance.setCreateBy( arg0.getCreateBy() );
        pluginInstance.setCreateTime( arg0.getCreateTime() );
        pluginInstance.setUpdateBy( arg0.getUpdateBy() );
        pluginInstance.setUpdateTime( arg0.getUpdateTime() );
        pluginInstance.setId( arg0.getId() );
        pluginInstance.setMainId( arg0.getMainId() );
        pluginInstance.setPluginId( arg0.getPluginId() );
        pluginInstance.setIp( arg0.getIp() );
        pluginInstance.setPort( arg0.getPort() );
        pluginInstance.setHeartbeatAt( arg0.getHeartbeatAt() );

        return pluginInstance;
    }

    @Override
    public PluginInstance convert(TbPluginInstance arg0, PluginInstance arg1) {
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
