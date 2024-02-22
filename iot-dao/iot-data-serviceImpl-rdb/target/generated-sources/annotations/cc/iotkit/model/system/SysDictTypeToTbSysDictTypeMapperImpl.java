package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysDictType;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysDictTypeToTbSysDictTypeMapperImpl implements SysDictTypeToTbSysDictTypeMapper {

    @Override
    public TbSysDictType convert(SysDictType arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysDictType tbSysDictType = new TbSysDictType();

        tbSysDictType.setCreateDept( arg0.getCreateDept() );
        tbSysDictType.setCreateBy( arg0.getCreateBy() );
        tbSysDictType.setCreateTime( arg0.getCreateTime() );
        tbSysDictType.setUpdateBy( arg0.getUpdateBy() );
        tbSysDictType.setUpdateTime( arg0.getUpdateTime() );
        tbSysDictType.setId( arg0.getId() );
        tbSysDictType.setTenantId( arg0.getTenantId() );
        tbSysDictType.setDictName( arg0.getDictName() );
        tbSysDictType.setDictType( arg0.getDictType() );
        tbSysDictType.setStatus( arg0.getStatus() );
        tbSysDictType.setRemark( arg0.getRemark() );

        return tbSysDictType;
    }

    @Override
    public TbSysDictType convert(SysDictType arg0, TbSysDictType arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setDictName( arg0.getDictName() );
        arg1.setDictType( arg0.getDictType() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
