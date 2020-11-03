/*
 * Copyright (c) 2020 Jacek Pawelski a.k.a. RubyNaxela
 *
 * Licensed under the GNU General Public License v3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * The license is included in file 'LICENSE.txt', which is part of this
 * source code package. You may also obtain a copy of the License at
 *
 *      https://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.rubynaxela.teaeditor.ui.dialogs;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * @since beta 1.5
 */
abstract class AbstractValidInputListener implements DocumentListener {

    private final JButton okButton;

    protected AbstractValidInputListener(JButton okButton) {
        this.okButton = okButton;
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        okButton.setEnabled(dataValid());
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        okButton.setEnabled(dataValid());
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        okButton.setEnabled(dataValid());
    }

    protected abstract boolean dataValid();
}
