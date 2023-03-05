package com.ra.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author jieniyu
 */
@Data
public class DeleteRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}