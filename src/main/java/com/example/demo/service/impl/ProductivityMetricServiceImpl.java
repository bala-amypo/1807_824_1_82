// package com.example.demo.service;

// import com.example.demo.model.ProductivityMetricRecord;
// import com.example.demo.repository.ProductivityMetricRecordRepository;
// import com.example.demo.util.ProductivityCalculator;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.time.LocalDate;
// import java.util.List;
// import java.util.Optional;

// @Service
// public class ProductivityMetricService {

//     @Autowired
//     private ProductivityMetricRecordRepository metricRepo;

//     public ProductivityMetricRecord recordMetric(ProductivityMetricRecord metric) {
//         // 1. Validate Date
//         if (metric.getDate() == null) {
//             metric.setDate(LocalDate.now());
//         }

//         // 2. Calculate Score using the Utility logic
//         // (This ensures the 'score' field is always populated correctly before saving)
//         double calculatedScore = ProductivityCalculator.computeScore(
//                 metric.getHoursLogged() != null ? metric.getHoursLogged() : 0.0,
//                 metric.getTasksCompleted() != null ? metric.getTasksCompleted() : 0,
//                 metric.getMeetingsAttended() != null ? metric.getMeetingsAttended() : 0
//         );
//         metric.setProductivityScore(calculatedScore);

//         // 3. Save to DB
//         return metricRepo.save(metric);
//     }

//     public Optional<ProductivityMetricRecord> getMetricById(Long id) {
//         return metricRepo.findById(id);
//     }

//     public List<ProductivityMetricRecord> getAllMetrics() {
//         return metricRepo.findAll();
//     }
// }

package com.example.demo.service;

import com.example.demo.model.ProductivityMetricRecord;
import com.example.demo.repository.ProductivityMetricRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductivityMetricServiceImpl implements ProductivityMetricService {

    private final ProductivityMetricRecordRepository metricRepo;

    public ProductivityMetricServiceImpl(ProductivityMetricRecordRepository metricRepo) {
        this.metricRepo = metricRepo;
    }

    @Override
    public ProductivityMetricRecord recordMetric(ProductivityMetricRecord record) {
        return metricRepo.save(record);
    }

    @Override
    public Optional<ProductivityMetricRecord> getMetricById(Long id) {
        return metricRepo.findById(id);
    }

    @Override
    public List<ProductivityMetricRecord> getAllMetrics() {
        return metricRepo.findAll();
    }

    @Override
    public List<ProductivityMetricRecord> getMetricsByEmployee(Long employeeId) {
        return metricRepo.findByEmployeeId(employeeId);
    }
}
