package cc.iotkit.data.model;

import cc.iotkit.model.system.SysDictData;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysDictDataToSysDictDataMapperImpl implements TbSysDictDataToSysDictDataMapper {

    @Override
    public SysDictData convert(TbSysDictData arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictData sysDictData = new SysDictData();

        sysDictData.setCreateDept( arg0.getCreateDept() );
        sysDictData.setCreateBy( arg0.getCreateBy() );
        sysDictData.setUpdateBy( arg0.getUpdateBy() );
        sysDictData.setUpdateTime( arg0.getUpdateTime() );
        sysDictData.setTenantId( arg0.getTenantId() );
        sysDictData.setId( arg0.getId() );
        sysDictData.setDictSort( arg0.getDictSort() );
        sysDictData.setDictLabel( arg0.getDictLabel() );
        sysDictData.setDictValue( arg0.getDictValue() );
        sysDictData.setDictType( arg0.getDictType() );
        sysDictData.setCssClass( arg0.getCssClass() );
        sysDictData.setListClass( arg0.getListClass() );
        sysDictData.setIsDefault( arg0.getIsDefault() );
        sysDictData.setStatus( arg0.getStatus() );
        sysDictData.setRemark( arg0.getRemark() );
        sysDictData.setCreateTime( arg0.getCreateTime() );

        return sysDictData;
    }

    @Override
    public SysDictData convert(TbSysDictData arg0, SysDictData arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setId( arg0.getId() );
        arg1.setDictSort( arg0.getDictSort() );
        arg1.setDictLabel( arg0.getDictLabel() );
        arg1.setDictValue( arg0.getDictValue() );
        arg1.setDictType( arg0.getDictType() );
        arg1.setCssClass( arg0.getCssClass() );
        arg1.setListClass( arg0.getListClass() );
        arg1.setIsDefault( arg0.getIsDefault() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setCreateTime( arg0.getCreateTime() );

        return arg1;
    }
}
