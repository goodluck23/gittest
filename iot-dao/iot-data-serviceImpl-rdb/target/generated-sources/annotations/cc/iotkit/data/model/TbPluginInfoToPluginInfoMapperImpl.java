package cc.iotkit.data.model;

import cc.iotkit.model.plugin.PluginInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbPluginInfoToPluginInfoMapperImpl implements TbPluginInfoToPluginInfoMapper {

    @Override
    public PluginInfo convert(TbPluginInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        PluginInfo pluginInfo = new PluginInfo();

        pluginInfo.setCreateDept( arg0.getCreateDept() );
        pluginInfo.setCreateBy( arg0.getCreateBy() );
        pluginInfo.setCreateTime( arg0.getCreateTime() );
        pluginInfo.setUpdateBy( arg0.getUpdateBy() );
        pluginInfo.setUpdateTime( arg0.getUpdateTime() );
        pluginInfo.setId( arg0.getId() );
        pluginInfo.setPluginId( arg0.getPluginId() );
        pluginInfo.setName( arg0.getName() );
        pluginInfo.setDescription( arg0.getDescription() );
        pluginInfo.setDeployType( arg0.getDeployType() );
        pluginInfo.setFile( arg0.getFile() );
        pluginInfo.setVersion( arg0.getVersion() );
        pluginInfo.setType( arg0.getType() );
        pluginInfo.setProtocol( arg0.getProtocol() );
        pluginInfo.setState( arg0.getState() );
        pluginInfo.setConfigSchema( arg0.getConfigSchema() );
        pluginInfo.setConfig( arg0.getConfig() );
        pluginInfo.setScript( arg0.getScript() );

        return pluginInfo;
    }

    @Override
    public PluginInfo convert(TbPluginInfo arg0, PluginInfo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setPluginId( arg0.getPluginId() );
        arg1.setName( arg0.getName() );
        arg1.setDescription( arg0.getDescription() );
        arg1.setDeployType( arg0.getDeployType() );
        arg1.setFile( arg0.getFile() );
        arg1.setVersion( arg0.getVersion() );
        arg1.setType( arg0.getType() );
        arg1.setProtocol( arg0.getProtocol() );
        arg1.setState( arg0.getState() );
        arg1.setConfigSchema( arg0.getConfigSchema() );
        arg1.setConfig( arg0.getConfig() );
        arg1.setScript( arg0.getScript() );

        return arg1;
    }
}
