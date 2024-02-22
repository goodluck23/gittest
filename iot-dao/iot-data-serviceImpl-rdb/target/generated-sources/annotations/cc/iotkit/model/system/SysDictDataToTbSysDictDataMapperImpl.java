package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysDictData;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysDictDataToTbSysDictDataMapperImpl implements SysDictDataToTbSysDictDataMapper {

    @Override
    public TbSysDictData convert(SysDictData arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysDictData tbSysDictData = new TbSysDictData();

        tbSysDictData.setCreateDept( arg0.getCreateDept() );
        tbSysDictData.setCreateBy( arg0.getCreateBy() );
        tbSysDictData.setCreateTime( arg0.getCreateTime() );
        tbSysDictData.setUpdateBy( arg0.getUpdateBy() );
        tbSysDictData.setUpdateTime( arg0.getUpdateTime() );
        tbSysDictData.setId( arg0.getId() );
        tbSysDictData.setTenantId( arg0.getTenantId() );
        tbSysDictData.setDictSort( arg0.getDictSort() );
        tbSysDictData.setDictLabel( arg0.getDictLabel() );
        tbSysDictData.setDictValue( arg0.getDictValue() );
        tbSysDictData.setDictType( arg0.getDictType() );
        tbSysDictData.setCssClass( arg0.getCssClass() );
        tbSysDictData.setListClass( arg0.getListClass() );
        tbSysDictData.setIsDefault( arg0.getIsDefault() );
        tbSysDictData.setStatus( arg0.getStatus() );
        tbSysDictData.setRemark( arg0.getRemark() );

        return tbSysDictData;
    }

    @Override
    public TbSysDictData convert(SysDictData arg0, TbSysDictData arg1) {
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
        arg1.setDictSort( arg0.getDictSort() );
        arg1.setDictLabel( arg0.getDictLabel() );
        arg1.setDictValue( arg0.getDictValue() );
        arg1.setDictType( arg0.getDictType() );
        arg1.setCssClass( arg0.getCssClass() );
        arg1.setListClass( arg0.getListClass() );
        arg1.setIsDefault( arg0.getIsDefault() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
