/*
 * Copyright 2017 Urs Fässler
 * SPDX-License-Identifier: Apache-2.0
 */

package world.bilo.stack.stream.message.parser;

class ChunkParserStrategy implements IsFinishedStrategy {

  @Override
  public boolean isFinished(PartParser active) {
    return active.isFinished();
  }

}