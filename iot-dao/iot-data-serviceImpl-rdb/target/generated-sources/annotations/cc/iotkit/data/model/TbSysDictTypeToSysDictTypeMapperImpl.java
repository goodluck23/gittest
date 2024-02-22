package cc.iotkit.data.model;

import cc.iotkit.model.system.SysDictType;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysDictTypeToSysDictTypeMapperImpl implements TbSysDictTypeToSysDictTypeMapper {

    @Override
    public SysDictType convert(TbSysDictType arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictType sysDictType = new SysDictType();

        sysDictType.setCreateDept( arg0.getCreateDept() );
        sysDictType.setCreateBy( arg0.getCreateBy() );
        sysDictType.setUpdateBy( arg0.getUpdateBy() );
        sysDictType.setUpdateTime( arg0.getUpdateTime() );
        sysDictType.setTenantId( arg0.getTenantId() );
        sysDictType.setId( arg0.getId() );
        sysDictType.setDictName( arg0.getDictName() );
        sysDictType.setDictType( arg0.getDictType() );
        sysDictType.setStatus( arg0.getStatus() );
        sysDictType.setRemark( arg0.getRemark() );
        sysDictType.setCreateTime( arg0.getCreateTime() );

        return sysDictType;
    }

    @Override
    public SysDictType convert(TbSysDictType arg0, SysDictType arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setId( arg0.getId() );
        arg1.setDictName( arg0.getDictName() );
        arg1.setDictType( arg0.getDictType() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setCreateTime( arg0.getCreateTime() );

        return arg1;
    }
}
