package io.github.xxyopen.novel.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Data;

/**
 * @author Kaze
 */
@Data
@Builder
public class UserPwdResetReqDto {
    @Schema(description = "手机号", example = "18888888888")
    @NotBlank(message = "手机号不能为空！")
    @Pattern(regexp = "^1[3-9][0-9]{9}$", message = "手机号格式不正确！")
    private String username;

    @Schema(description = "密码",example = "123456")
    @NotBlank(message = "密码不能为空！")
    private String newPassword;
}
