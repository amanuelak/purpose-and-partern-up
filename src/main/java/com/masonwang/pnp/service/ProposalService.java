package com.masonwang.pnp.service;

import com.masonwang.pnp.entity.Proposal;
import com.masonwang.pnp.entity.Team;

import java.util.List;

public interface ProposalService {
    Proposal getProposal(Long id);
    Proposal saveProposal(Long userId, Proposal proposal);
    void deleteProposal(Long id);
    Proposal updateProposal(Long id, Proposal proposal);
    Proposal updateProposalName(Long id, String name);
    Proposal updateProposalDescription(Long id, String description);
    Proposal updateProposalTeam(Long id, Team team);
    List<Proposal> getProposals();
}
