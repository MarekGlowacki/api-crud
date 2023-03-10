package online.javafun.architecture.jobOffer;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
class JobOfferService {
    private JobOfferRepository jobOfferRepository;
    private JobOfferDtoMapper jobOfferDtoMapper;

    public JobOfferService(JobOfferRepository jobOfferRepository, JobOfferDtoMapper jobOfferDtoMapper) {
        this.jobOfferRepository = jobOfferRepository;
        this.jobOfferDtoMapper = jobOfferDtoMapper;
    }

    Optional<JobOfferDto> getOfferById(Long id) {
        return jobOfferRepository.findById(id).map(jobOfferDtoMapper::map);
    }

    JobOfferDto saveOffer(JobOfferDto jobOfferDto) {
        JobOffer jobOffer = jobOfferDtoMapper.map(jobOfferDto);
        jobOffer.setDateAdded(LocalDateTime.now());
        JobOffer savedJobOffer = jobOfferRepository.save(jobOffer);
        return jobOfferDtoMapper.map(savedJobOffer);
    }

    void updateOffer(JobOfferDto jobOfferDto) {
        JobOffer jobOfferToUpdate = jobOfferDtoMapper.map(jobOfferDto);
        jobOfferRepository.save(jobOfferToUpdate);
    }

    void deleteOffer(Long id) {
        jobOfferRepository.deleteById(id);
    }
}
