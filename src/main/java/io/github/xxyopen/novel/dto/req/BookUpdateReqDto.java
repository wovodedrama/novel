package io.github.xxyopen.novel.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author Kaze
 */
@Data
public class BookUpdateReqDto {

    /**
     * 小说封面地址
     */
    @Schema(description = "小说封面地址")
    @NotNull
    private String picUrl;

    /**
     * 小说简介
     */
    @Schema(description = "小说简介")
    @NotNull
    private String bookDesc;
}
