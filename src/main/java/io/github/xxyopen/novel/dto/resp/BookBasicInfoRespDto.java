package io.github.xxyopen.novel.dto.resp;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kaze
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookBasicInfoRespDto {

    /**
     * 类别名
     */
    @Schema(description = "类别名")
    private String categoryName;

    /**
     * 小说封面地址
     */
    @Schema(description = "小说封面地址")
    private String picUrl;

    /**
     * 小说名
     */
    @Schema(description = "小说名")
    private String bookName;

    /**
     * 作家名
     */
    @Schema(description = "作家名")
    private String authorName;

    /**
     * 书籍描述
     */
    @Schema(description = "书籍描述")
    private String bookDesc;

    /**
     * 总字数
     */
    @Schema(description = "总字数")
    private Integer wordCount;

    /**
     * 点击量
     */
    @Schema(description = "点击量")
    private Long visitCount;
}
