/*
 * This file is part of LuckPerms, licensed under the MIT License.
 *
 *  Copyright (c) lucko (Luck) <luck@lucko.me>
 *  Copyright (c) contributors
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */

package me.lucko.luckperms.api.event.track;

import me.lucko.luckperms.api.event.LuckPermsEvent;
import me.lucko.luckperms.api.event.Param;
import me.lucko.luckperms.api.event.cause.DeletionCause;

import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.List;

/**
 * Called when a track is deleted
 */
public interface TrackDeleteEvent extends LuckPermsEvent {

    /**
     * Gets the name of the deleted track
     *
     * @return the name of the deleted track
     */
    @NonNull @Param(0) String getTrackName();

    /**
     * Gets an immutable copy of the tracks existing data
     *
     * @return a copy of the tracks existing data
     */
    @NonNull @Param(1) List<String> getExistingData();

    /**
     * Gets the cause of the deletion
     *
     * @return the cause of the deletion
     */
    @NonNull @Param(2) DeletionCause getCause();

}
