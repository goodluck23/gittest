package cc.iotkit.model.plugin;

import cc.iotkit.data.model.TbPluginInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class PluginInfoToTbPluginInfoMapperImpl implements PluginInfoToTbPluginInfoMapper {

    @Override
    public TbPluginInfo convert(PluginInfo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbPluginInfo tbPluginInfo = new TbPluginInfo();

        tbPluginInfo.setCreateDept( arg0.getCreateDept() );
        tbPluginInfo.setCreateBy( arg0.getCreateBy() );
        tbPluginInfo.setCreateTime( arg0.getCreateTime() );
        tbPluginInfo.setUpdateBy( arg0.getUpdateBy() );
        tbPluginInfo.setUpdateTime( arg0.getUpdateTime() );
        tbPluginInfo.setId( arg0.getId() );
        tbPluginInfo.setPluginId( arg0.getPluginId() );
        tbPluginInfo.setName( arg0.getName() );
        tbPluginInfo.setDescription( arg0.getDescription() );
        tbPluginInfo.setDeployType( arg0.getDeployType() );
        tbPluginInfo.setFile( arg0.getFile() );
        tbPluginInfo.setVersion( arg0.getVersion() );
        tbPluginInfo.setType( arg0.getType() );
        tbPluginInfo.setProtocol( arg0.getProtocol() );
        tbPluginInfo.setState( arg0.getState() );
        tbPluginInfo.setConfigSchema( arg0.getConfigSchema() );
        tbPluginInfo.setConfig( arg0.getConfig() );
        tbPluginInfo.setScript( arg0.getScript() );

        return tbPluginInfo;
    }

    @Override
    public TbPluginInfo convert(PluginInfo arg0, TbPluginInfo arg1) {
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
