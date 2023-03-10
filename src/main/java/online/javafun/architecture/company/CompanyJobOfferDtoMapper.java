package online.javafun.architecture.company;

import online.javafun.architecture.jobOffer.JobOffer;
import org.springframework.stereotype.Service;

@Service
class CompanyJobOfferDtoMapper {
    CompanyJobOfferDto map(JobOffer jobOffer) {
        CompanyJobOfferDto dto = new CompanyJobOfferDto();
        dto.setId(jobOffer.getId());
        dto.setTitle(jobOffer.getTitle());
        dto.setLocation(jobOffer.getLocation());
        dto.setMinSalary(jobOffer.getMinSalary());
        dto.setMaxSalary(jobOffer.getMaxSalary());
        return dto;
    }
}
