package cc.iotkit.model.product;

import cc.iotkit.data.model.TbCategory;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class CategoryToTbCategoryMapperImpl implements CategoryToTbCategoryMapper {

    @Override
    public TbCategory convert(Category arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbCategory tbCategory = new TbCategory();

        tbCategory.setId( arg0.getId() );
        tbCategory.setName( arg0.getName() );
        tbCategory.setCreateAt( arg0.getCreateAt() );

        return tbCategory;
    }

    @Override
    public TbCategory convert(Category arg0, TbCategory arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
