package com.danli.common.lang.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 传给前端的PV和UV的视图对象
 * @EqualsAndHashCode作用：
 * 1 此注解会生成equals(Object other) 和 hashCode()方法。
 * 2 它默认使用非静态，非瞬态的属性
 * @Data相当于@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode这5个注解的合集
 *
 *
 * @author luzhiwei
 * @date 2021/12/12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class VisitorNum  implements Serializable {
    private static final long serialVersionUID = 1L;
    int uv;
    int pv;
}