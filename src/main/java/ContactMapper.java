import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

@Mapper
@DecoratedWith(ContactMapperDecorator.class)
public interface ContactMapper {
    ContactMapper INSTANCE = Mappers.getMapper(ContactMapper.class);

    @Mappings({
            @Mapping(source = "phone", target = "businessPhone"),
            @Mapping(source = "email", target = "businessEmail"),
            @Mapping(target = "businessCountry", constant="USA")
    })

    BusinessContact primaryToBusinessContact(PrimaryContact primary);


    @InheritInverseConfiguration
    PrimaryContact businessToPrimaryContact(BusinessContact business);
}
