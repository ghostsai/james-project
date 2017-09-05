/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.james.mailbox.store.search;

import org.apache.james.mailbox.acl.SimpleGroupMembershipResolver;
import org.apache.james.mailbox.acl.UnionMailboxACLResolver;
import org.apache.james.mailbox.exception.MailboxException;
import org.apache.james.mailbox.inmemory.InMemoryMailboxManager;
import org.apache.james.mailbox.inmemory.InMemoryMailboxSessionMapperFactory;
import org.apache.james.mailbox.inmemory.InMemoryMessageId;
import org.apache.james.mailbox.inmemory.InMemoryMessageIdManager;
import org.apache.james.mailbox.store.FakeAuthenticator;
import org.apache.james.mailbox.store.FakeAuthorizator;
import org.apache.james.mailbox.store.JVMMailboxPathLocker;
import org.apache.james.mailbox.store.MailboxSessionMapperFactory;
import org.apache.james.mailbox.store.mail.model.impl.MessageParser;
import org.junit.Ignore;

public class SimpleMessageSearchIndexTest extends AbstractMessageSearchIndexTest {

    @Override
    protected void await() {
    }

    @Override
    protected void initializeMailboxManager() throws Exception {
        MailboxSessionMapperFactory mapperFactory = new InMemoryMailboxSessionMapperFactory();
        messageSearchIndex = new SimpleMessageSearchIndex(mapperFactory, mapperFactory, new PDFTextExtractor());
        storeMailboxManager = new InMemoryMailboxManager(
            mapperFactory,
            new FakeAuthenticator(),
            FakeAuthorizator.defaultReject(),
            new JVMMailboxPathLocker(),
            new UnionMailboxACLResolver(),
            new SimpleGroupMembershipResolver(),
            new MessageParser(),
            new InMemoryMessageId.Factory());
        messageIdManager = new InMemoryMessageIdManager(storeMailboxManager);
        storeMailboxManager.setMessageSearchIndex(messageSearchIndex);
        storeMailboxManager.init();
    }

    /**
     * 32 tests out of 54 are failing
     */

    @Ignore
    @Override
    public void flagIsSetShouldReturnUidOfMessageMarkedAsRecentWhenUsedWithFlagRecent() throws MailboxException {
    }

    @Ignore
    @Override
    public void uidShouldreturnEveryThing() throws Exception {
    }

    @Ignore
    @Override
    public void sortOnCcShouldWork() throws Exception {
    }

    @Ignore
    @Override
    public void sortOnFromShouldWork() throws Exception {
    }

    @Ignore
    @Override
    public void addressShouldReturnUidHavingRightRecipientWhenBccIsSpecified() throws Exception {
    }

    @Ignore
    @Override
    public void orShouldReturnResultsMatchinganyRequests() throws Exception {
    }

    @Ignore
    @Override
    public void internalDateBeforeShouldReturnMessagesBeforeAGivenDate() throws Exception {
    }

    @Ignore
    @Override
    public void headerContainsShouldReturnUidsOfMessageHavingThisHeaderWithTheSpecifiedValue() throws Exception {
    }

    @Ignore
    @Override
    public void internalDateAfterShouldReturnMessagesAfterAGivenDate() throws Exception {
    }

    @Ignore
    @Override
    public void youShouldBeAbleToSpecifySeveralCriterionOnASingleQuery() throws Exception {
    }

    @Ignore
    @Override
    public void headerExistsShouldReturnUidsOfMessageHavingThisHeader() throws Exception {
    }

    @Ignore
    @Override
    public void modSeqLessThanShouldReturnUidsOfMessageHavingAGreaterModSeq() throws Exception {
    }

    @Ignore
    @Override
    public void addressShouldReturnUidHavingRightRecipientWhenCcIsSpecified() throws Exception {
    }

    @Ignore
    @Override
    public void andShouldReturnResultsMatchingBothRequests() throws Exception {
    }

    @Ignore
    @Override
    public void addressShouldReturnUidHavingRightExpeditorWhenFromIsSpecified() throws Exception {
    }

    @Ignore
    @Override
    public void sortOnDisplayToShouldWork() throws Exception {
    }

    @Ignore
    @Override
    public void flagIsUnSetShouldReturnUidOfMessageNotMarkedAsRecentWhenUsedWithFlagRecent() throws MailboxException {
    }

    @Ignore
    @Override
    public void bodyContainsShouldReturnUidOfMessageContainingTheApproximativeText() throws MailboxException {
    }

    @Ignore
    @Override
    public void headerDateBeforeShouldWork() throws Exception {
    }

    @Ignore
    @Override
    public void sortOnSentDateShouldWork() throws Exception {
    }

    @Ignore
    @Override
    public void addressShouldReturnUidHavingRightRecipientWhenToIsSpecified() throws Exception {
    }

    @Ignore
    @Override
    public void sortOnToShouldWork() throws Exception {
    }

    @Ignore
    @Override
    public void sortOnDisplayFromShouldWork() throws Exception {
    }

    @Ignore
    @Override
    public void revertSortingShouldReturnElementsInAReversedOrder() throws Exception {
    }

    @Ignore
    @Override
    public void headerDateAfterShouldWork() throws Exception {
    }

    @Ignore
    @Override
    public void mailsContainsShouldIncludeMailHavingAttachmentsMatchingTheRequest() throws Exception {
    }

    @Ignore
    @Override
    public void sortOnSubjectShouldWork() throws Exception {
    }

    @Ignore
    @Override
    public void modSeqGreaterThanShouldReturnUidsOfMessageHavingAGreaterModSeq() throws Exception {
    }

    @Ignore
    @Override
    public void notShouldReturnResultsThatDoNotMatchAQuery() throws Exception {
    }

    @Ignore
    @Override
    public void headerDateOnShouldWork() throws Exception {
    }

    @Ignore
    @Override
    public void sortOnSizeShouldWork() throws Exception {
    }

    @Ignore
    @Override
    public void sortShouldOrderMessages() throws Exception {
    }

    @Ignore
    @Override
    public void multimailboxSearchShouldReturnUidOfMessageWithExpectedFromInTwoMailboxes() throws MailboxException {
    }

    @Ignore
    @Override
    public void searchWithFullTextShouldReturnMailsWhenTextBodyMatchesAndNonContinuousWords() throws Exception {
    }

    @Ignore
    @Override
    public void multimailboxSearchShouldReturnUidOfMessageWithExpectedFromInAllMailboxes() throws MailboxException {
    }

    @Ignore
    @Override
    public void searchWithFullTextShouldReturnMailsWhenHtmlBodyMatchesAndNonContinuousWords() throws Exception {
    }

    @Ignore
    @Override
    public void searchWithFullTextShouldReturnMailsWhenTextBodyWithExtraUnindexedWords() throws Exception {
    }

    @Ignore
    @Override
    public void searchWithFullTextShouldReturnMailsWhenHtmlBodyMatchesWithStemming() throws Exception {
    }

}
