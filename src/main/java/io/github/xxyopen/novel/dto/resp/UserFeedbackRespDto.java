package io.github.xxyopen.novel.dto.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 用户反馈响应Dto
 *
 * @author Kaze
 * @date 2025/1/19
 */
@Data
@Builder
public class UserFeedbackRespDto {

    @Schema(description = "反馈内容")
    private String feedbackContent;

    @Schema(description = "反馈时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime feedbackTime;

}
