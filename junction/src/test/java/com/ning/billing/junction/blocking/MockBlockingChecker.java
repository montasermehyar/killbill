/*
 * Copyright 2010-2011 Ning, Inc.
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

package com.ning.billing.junction.blocking;

import com.ning.billing.account.api.Account;
import com.ning.billing.entitlement.api.user.Subscription;
import com.ning.billing.entitlement.api.user.SubscriptionBundle;
import com.ning.billing.junction.api.BlockingApiException;
import com.ning.billing.junction.block.BlockingChecker;

public class MockBlockingChecker implements BlockingChecker {

    @Override
    public void checkBlockedChange(Subscription subscription) throws BlockingApiException {
        // Intentionally blank
        
    }

    @Override
    public void checkBlockedChange(SubscriptionBundle bundle) throws BlockingApiException {
     // Intentionally blank
        
    }

    @Override
    public void checkBlockedChange(Account account) throws BlockingApiException {
     // Intentionally blank
        
    }

    @Override
    public void checkBlockedEntitlement(Subscription subscription) throws BlockingApiException {
     // Intentionally blank
        
    }

    @Override
    public void checkBlockedEntitlement(SubscriptionBundle bundle) throws BlockingApiException {
     // Intentionally blank
        
    }

    @Override
    public void checkBlockedEntitlement(Account account) throws BlockingApiException {
     // Intentionally blank
        
    }

    @Override
    public void checkBlockedBilling(Subscription subscription) throws BlockingApiException {
     // Intentionally blank
        
    }

    @Override
    public void checkBlockedBilling(SubscriptionBundle bundleId) throws BlockingApiException {
     // Intentionally blank
        
    }

    @Override
    public void checkBlockedBilling(Account account) throws BlockingApiException {
     // Intentionally blank
        
    }

   
}
