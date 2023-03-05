package com.ra.project.common;

import lombok.Data;

import java.io.Serializable;

/**
 * Id 请求
 *
 * @author jieniyu
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}