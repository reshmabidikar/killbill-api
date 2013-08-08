/*
 * Copyright 2010-2013 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.payment.api;

import com.ning.billing.util.entity.Entity;
import org.joda.time.DateTime;

import java.util.UUID;

public interface PaymentAttempt extends Entity {

    /**
     * @return the payment attempt id
     */
    UUID getId();

    /**
     * @return the date when that attempt was made
     */
    DateTime getEffectiveDate();

    /**
     * @return the error code from the gateway
     */
    String getGatewayErrorCode();

    /**
     * @return the error message from the gateway
     */
    String getGatewayErrorMsg();

    /**
     * @return the status for that attempt
     */
    PaymentStatus getPaymentStatus();
}
