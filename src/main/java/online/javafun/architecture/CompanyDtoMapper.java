package online.javafun.architecture;

import org.springframework.stereotype.Service;

@Service
public class CompanyDtoMapper {
    CompanyDto map(Company company) {
        CompanyDto companyDto = new CompanyDto();
        companyDto.setId(company.getId());
        companyDto.setName(company.getName());
        companyDto.setDescription(company.getDescription());
        companyDto.setCity(company.getCity());
        companyDto.setEmployees(company.getEmployees());
        companyDto.setTelephone(company.getTelephone());
        companyDto.setEmail(company.getEmail());
        return companyDto;
    }
}
